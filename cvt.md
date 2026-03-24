# Nebula Specification: Causal Validity Tracking (CVT)

## 1. The Core Philosophy

Nebula memory safety is governed by **Causality**, not Ownership.
Safety is defined as the prevention of **Temporal Memory Violations**: a program is valid if and only if no **View** is accessed after its causal source (the **Region**) has been deallocated or invalidated.

---

## 2. Type System: One Keyword — `type`

Nebula has a single keyword for user-defined aggregate types: `type`. There is no separate `struct` / `class` distinction. Every `type` is always CVT-tracked, regardless of where its backing storage lives.

### 2.1 `type` (Stack-Allocated by Default)

* **Definition:** A `type` describes the field layout of a CVT-tracked value.
* **Allocation:** The compiler prefers the **stack** when the region does not escape.
* **Construction:** Via tuple-literal syntax—positional `(1, 2)` or named `(x: 1, y: 2)`.
* **Identity:** Each variable is its own region. Assignment copies fields (shallow copy of members).
* **CVT Role:** The compiler tracks the region's validity just like any other heap-allocated region.
* **Important:** "stack" is a default codegen strategy, not a semantic promise. Final placement is decided after escape analysis.

```nebula
type Point { i32 x; i32 y; }

Point p = (3, 4);         // stack region, CVT-tracked
Point q = (x: 1, y: -2); // named-field construction
```

### 2.2 `box T` (Heap-Allocated)

To opt into heap allocation, wrap the type in `box`. The resulting value is still a **View** into a CVT-tracked **Region**—the only difference is where the backing memory lives.

```nebula
Box<Point> hp = Box.new((3, 4)); // heap region, CVT-tracked
```

Heap-backed collections (e.g. `List<T>`, `Map<K,V>`) also internally use heap regions and are tracked the same way.

### 2.3 Methods Live in `impl`

A `type` body contains **only field declarations**. Methods, operators, and constructors are defined in a separate `impl` block to keep data layout and behaviour cleanly separated.

```nebula
type Vec2 { f64 x; f64 y; }

impl Vec2
{
    f64 length() => (this.x * this.x + this.y * this.y)
    Vec2 operator+(Vec2 other) => (this.x + other.x, this.y + other.y)
}
```

### 2.4 Trait Implementations

Shared behaviour is expressed through traits. Any `type` can fulfil a trait contract:

```nebula
trait Stringable { str toStr(); }

impl Stringable for Vec2
{
    str toStr() => $"Vec2({this.x}, {this.y})"
}
```

---

## 3. The CVT State Engine

The compiler maintains a **State Table** for every Region ID ($R$) at every point in the Control Flow Graph (CFG).

### 3.1 Region States

| State | Definition | Access Allowed? |
| --- | --- | --- |
| **Valid** | The Region is live (stack frame active or heap allocation exists). | Yes |
| **Captured** | The Region has been assigned as a field into another Region (the Parent). | Yes, via parent |
| **Global** | The Region is attached to a static or global root. | Yes |
| **MaybeInvalid** | State is ambiguous due to branching or a `backlink`. | **No** (Requires Proof) |
| **Invalid** | The Region has been dropped, freed, or consumed by a `drops` call. | No |

### 3.2 The State Union Rule (Branching)

When two control flow paths merge (e.g., after an `if/else`), the compiler performs a set union on the states of each Region:

$$\text{State}(R_{\text{merged}}) = \text{State}(R_{\text{pathA}}) \cup \text{State}(R_{\text{pathB}})$$

* `Valid` $\cup$ `Invalid` $\to$ `MaybeInvalid`.
* Accessing a `MaybeInvalid` Region results in a compile-time error unless guarded by a **Validity Proof** (e.g., `if (obj != none)`).

### 3.3 Escape Analysis and Return Boundaries (Critical)

CVT is **not** heap-only. It applies equally to stack-backed and heap-backed regions.

The common confusion is to treat "stack vs heap" as fixed at the line where a value is created. In Nebula, that is not the model. Placement is finalized after escape analysis.

When a region escapes its defining scope (for example, by being returned), the compiler preserves validity by relocating/promoting the region rather than invalidating it.

Given:

```nebula
type User
{
    str name;
    i32 age;
}

User foo()
{
    User a = ("John Doe", 30);
    return a;
}
```

Conceptually, `a` creates region $R_1`. Returning `a` causes $R_1` to escape `foo()`.

At that boundary the compiler chooses one valid strategy:

1. **Caller-frame relocation / in-place return construction** (preferred when possible).
2. **Heap promotion** (used when required by control flow, async capture, closure capture, etc.).

In both strategies, CVT sees a continuous valid region in the caller:

* Inside `foo()`: `a -> R_1 (Valid)`
* At return: `R_1` is transferred/promoted (not invalidated)
* In caller: `u1 -> R_1 (Valid)`

So this rule is fundamental:

* ❌ "Stack regions cannot be returned"
* ✅ "Regions cannot outlive their causal scope unless relocated or promoted"

Relocation/promotion is automatic and abstraction-preserving: `User` remains "a view to a region" regardless of physical placement.

---

## 4. Causal Mechanics & Hierarchy

### 4.1 The Capture Rule

When a View of Region $B$ is assigned to a field within Region $A$, $B$ transitions to the **Captured** state.

* $A$ is now the **Causal Parent** of $B$.
* $B$ cannot be freed as long as $A$ is `Valid`.

This applies equally whether $A$ is stack-allocated or heap-allocated. Storage location does not affect the causal graph.

### 4.2 The Multi-Parent Union

If $B$ is captured by multiple parents $\{P_1, P_2, \dots, P_n\}$, its validity is the logical OR of its parents' validity:

$$\text{Valid}(V_B) \iff \left( \bigvee_{i=1}^{n} \text{Valid}(P_i) \right) \wedge \neg \text{Dropped}(R_B)$$

### 4.3 Breaking Cycles: `backlink`

A `backlink` field is a View that **does not** establish a causal parent-child relationship.

* **Safety:** A `backlink` is always treated as `MaybeInvalid` by the compiler.
* **Promotion:** To use a `backlink`, guard it with an existence check. This prevents causal deadlocks (memory leaks caused by two regions keeping each other alive indefinitely).

```nebula
type Node
{
    i32 value;
    backlink Node? parent; // does NOT count as a causal parent
}

impl Node
{
    void printParent(keeps Node self)
    {
        if (self.parent != none)
        {
            // self.parent is promoted to Valid inside this block
            println(self.parent!.value);
        }
    }
}
```

---

## 5. Deterministic Deallocation (LUA)

Nebula does not use a Garbage Collector or Reference Counting. It uses **Last-Usage Analysis (LUA)**.

1. **Liveness Mapping:** The compiler identifies the final instruction in the CFG where a View of Region $R$ (or any aggregate containing a View of $R$) is accessed.
2. **Injection:** A `free(R)` call is injected at the end of the scope containing that final instruction.
3. **Hierarchy Check:** If $R$ is `Captured`, the `free(R)` call is deferred until the last use of its final remaining Causal Parent.

This applies uniformly to all regions—stack regions (their backing storage is automatically reclaimed) and heap regions (an explicit `free` is injected).

---

## 6. The FFI Boundary & Parameter Hinting

Since C code is opaque to the Nebula compiler, hints extend the Causal Chain into external binaries.

### 6.1 Primitive Types

* **`Ref<T>`**: A raw memory address. Used for low-level pointer arithmetic and FFI.

### 6.2 Mandatory Hints

* **`keeps`**: The function reads the memory but does not claim it. The Region remains `Valid` after the call.
* **`drops`**: The function consumes the memory. The Region transitions to `Invalid` in Nebula immediately after the call.

> The **default** for `extern "C"` functions is `drops`. This forces explicit annotation at every FFI boundary rather than silently allowing C to consume Nebula memory.

---

## 7. Standard Library Primitives

### 7.1 The `str` Type

`str` is a built-in aggregate type representing a string slice. It is a View into a character region.

```nebula
type str
{
    char[] data;  // View into a heap (or static) Region
    u64    len;   // Byte count
}
```

* **Safety:** As long as any `str` (the original or a slice) is live, the `char[]` Region is `Valid`.
* **Slicing:** `str.slice(start, length)` returns a new `str` pointing into the **same** Region—no copy, no allocation.
* **FFI:** Passes to C as a 16-byte structure (pointer + length).

### 7.2 Arrays

* **Fixed Arrays (`T[N]`)**: Allocated inline within the owning region (stack or inside a `box`). No separate CVT tracking required.
* **Dynamic Arrays / Collections (`List<T>`, etc.)**: Heap-backed. The CVT engine tracks the underlying allocation Region. Pointer arithmetic within bounds is allowed.

---

## 8. Summary of Edge Cases

* **Reassignment:** If a View `v` to $R_1$ is reassigned to $R_2$, the compiler performs LUA on $R_1$ immediately. If `v` was the last view to $R_1$, $R_1$ is freed at the point of reassignment.
* **Escaping via Return:** If a function returns a View or a type containing a View, the region is relocated to caller scope or promoted to heap as needed; LUA ownership/last-use then continues from the caller.
* **Nested Types:** CVT flattens the dependency. A `type Outer` containing a `type Inner` which itself contains a region view is tracked as a single proxy for the underlying Region.
* **Stack Regions vs Heap Regions:** The state machine rules are identical. "Stack" is a non-escaping optimization; escaping regions are relocated or heap-promoted so causality remains valid.

