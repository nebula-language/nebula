# 🌌 Idiomatic Nebula: From C-Brain to Causal Logic

## 1. Stop Using "Magic Integers" for State
**The Old Way:** Returning `-1` for errors or `0/1/2` for types.
**The Nebula Way:** Use **Enums** and **Tagged Unions**.

In Nebula, a function should never return a "guessable" error code. Use a `tagged union` to force the caller to handle success and failure at compile-time.

```nebula
// ❌ BAD: C-style (Magic numbers, no enforcement)
i64 openFile(str path); // Returns -1 on error

// ✅ GOOD: Nebula-style (Exhaustive, Safe)
tagged union FileResult
{
    Ok(File handle),
    Err(FsError reason)
}

// Caller is forced to handle both branches at compile time:
FileResult result = openFile("config.toml");
i64 fd = match (result)
{
    Ok(handle) => handle.fd,
    Err(e)     => panic($"Failed: {e}")
};
```

## 2. Embrace the Optional (`T?`)
**The Old Way:** Returning an empty str `""` or a "Null Object."
**The Nebula Way:** Use `none` as a first-class validity state.

An optional `str?` is a **CVT-tracked view** that the compiler marks as `MaybeInvalid`. It **prevents** you from using it directly until you "promote" it through a validity check. The three idiomatic promotion patterns are:

```nebula
str? getVal(str key) => ...

var v = getVal("API_KEY");

// ── Pattern 1: existence check → promotes v to Valid inside the block ────
if (v != none)
{
    println(v.length); // ✅ Valid here
}

// ── Pattern 2: null-coalescing operator ?? ───────────────────────────────
str key = v ?? "default"; // ✅ always a str

// ── Pattern 3: force-unwrap ! (crashes on none — only for truly known values)
str key2 = v!; // ⚠ panics if none
```

## 3. CVT — Your Safety Net
**Causal Validity Tracking (CVT)** is the compiler system that prevents dangling references, use-after-free, and invalid memory access—without a garbage collector or borrow checker.

Every value in Nebula lives in a **Region** (the backing memory). A variable is a **View** into that region. The compiler tracks the state of every region at every point in the program:

| State | Meaning | Accessible? |
| :--- | :--- | :--- |
| **Valid** | Region is live. | ✅ Yes |
| **Captured** | Region is owned by another region (a parent). | ✅ Yes, via parent |
| **MaybeInvalid** | Could be valid or not (after a branch, or a `backlink`). | ⚠ Needs a proof |
| **Invalid** | Region has been freed or consumed. | ❌ Compiler error |

All user-defined `type`s are CVT-tracked. Stack allocation is the default; heap allocation is opted into via `box T` or heap-backed collections.

```nebula
type Resource { i32 id; }
impl Resource { void log(keeps Resource self) => println($"Resource {self.id}") }

// ── keeps: the compiler knows the caller's view stays Valid ─────────────
void inspect(keeps Resource r) { r.log(); }

// ── drops: the caller's view is marked Invalid after this call ──────────
void consume(drops Resource r) { println($"consuming {r.id}"); }

void main()
{
    Resource r = (id: 42);
    inspect(r);   // r still Valid
    inspect(r);   // r still Valid
    consume(r);   // r is now Invalid
    // inspect(r); // ❌ Compile error: r is Invalid
}
```

> **Deallocation is automatic.** The compiler uses **Last-Usage Analysis (LUA)** to inject `free()` exactly at the last point each region is accessed. You never call `free()` manually.

## 4. `type` + `impl` — The Only User-Defined Type
**The Old Way:** Two keywords (`struct` for stack, `class` for heap) with different rules.
**The Nebula Way:** One keyword: `type`. All types are CVT-tracked; storage location is controlled separately.

A `type` body **only contains fields**. Methods live in a separate `impl` block. This keeps data layout and behaviour cleanly separated.

```nebula
// ── Define shape (fields only) ───────────────────────────────────────────
type Vec2
{
    f64 x;
    f64 y;
}

// ── Add methods ──────────────────────────────────────────────────────────
impl Vec2
{
    f64 length() => (this.x * this.x + this.y * this.y)

    Vec2 operator+(Vec2 other) => (this.x + other.x, this.y + other.y)
}

// ── Tuple-literal construction: positional or named ──────────────────────
Vec2 a = (1.0, 2.0);
Vec2 b = (x: 3.0, y: 4.0);
Vec2 c = a + b;
```

Stack by default. To allocate on the heap, wrap with `box`:

```nebula
box Vec2 heapVec = box (1.0, 2.0); // heap-allocated, CVT-tracked
```

## 5. Traits — Shared Behaviour Without Inheritance
**Traits** define a contract. Any `type` can fulfil a contract by providing an `impl Trait for Type` block. This replaces class hierarchies entirely.

```nebula
trait Stringable
{
    str toStr();
}

trait Measurable
{
    f64 area();
}

type Rect { f64 w; f64 h; }

impl Stringable for Rect
{
    str toStr() => $"Rect({this.w} × {this.h})"
}

impl Measurable for Rect
{
    f64 area() => this.w * this.h
}

// Trait as a parameter type (erased dispatch):
void print_shape(Stringable s)
{
    println(s.toStr());
}
```

A type can implement many traits; a trait can be used as a parameter type for erased dispatch.

## 6. Tuples — Lightweight Composite Values
Tuples are anonymous product types. Use them for multi-value returns and lightweight data grouping—no need to declare a full `type` for transient data.

```nebula
// ── Positional tuple ─────────────────────────────────────────────────────
(str, i32) person = ("Alice", 30);
println($"{person.0} is {person.1}yo");

// ── Named tuple: access by name ──────────────────────────────────────────
(str name, i32 age) user = ("Bob", 25);
println($"{user.name} is {user.age}yo");

// ── Named construction: order doesn't matter ─────────────────────────────
(str name, i32 age) u2 = (age: 40, name: "Carol");

// ── Multi-value return ───────────────────────────────────────────────────
(i32, bool) divide(i32 a, i32 b)
{
    if (b == 0) return (0, false);
    return (a / b, true);
}

var result = divide(10, 2);
if (result.1) { println(result.0); }
```

Types can also be constructed from tuple literals directly:

```nebula
type Point { i32 x; i32 y; }

Point p = (3, 4);           // positional
Point q = (x: 1, y: -2);   // named
```

## 7. Optional & Named Parameters — Call Like You Mean It
Default parameter values eliminate boilerplate overloads. Named call semantics (C#-style) let callers skip over defaults and pass only what they care about, in any order.

```nebula
void connect(str host, i32 port = 8080, bool tls = false, i32 timeout = 30)
{
    println($"Connecting to {host}:{port} (tls={tls}, timeout={timeout}s)");
}

// ── All defaults ─────────────────────────────────────────────────────────
connect("example.com");

// ── Override just tls, keep port and timeout defaults ────────────────────
connect("example.com", tls: true);

// ── Positional + named mixed: positional must come first ─────────────────
connect("example.com", 443, tls: true);

// ── All named, any order ─────────────────────────────────────────────────
connect(timeout: 60, host: "example.com", tls: true);
```

This also works with tuple parameters and optional types:

```nebula
void foo(i32 a = 0, f32 b = 0f, (str, i32) d = ("Default", 0), u8? f = none)
{
    println($"a={a}, b={b}, d={d}, f={f}");
}

foo(3, d: ("custom", 7));           // skip b, keep d named
foo(b: 3.14f, f: (u8) 42);         // only named, out of order
```

## 8. Tags — Metadata for the Compiler and Tooling
Tags (written `#[name]` or `#[name("arg")]`) are compile-time annotations attached to declarations. They communicate intent to the compiler, test runner, reflection system, or future tooling.

```nebula
// ── Mark a function as a test case (discovered by std::reflect) ──────────
#[test]
void test_addition()
{
    expect_eq(1 + 1, 2, "basic add");
}

// ── Skip a test without deleting it ──────────────────────────────────────
#[test]
#[ignored]
void test_not_ready_yet() { }

// ── Deprecation warning emitted at every call site ───────────────────────
#[deprecated("use newApi() instead")]
void oldApi() { }
```

Tags stack freely. Multiple tags on one declaration are applied in order, top to bottom.

## 9. Match is your Best Friend
**The Old Way:** Deeply nested `if/else` blocks checking ASCII codes like `if (ch == 91)`.
**The Nebula Way:** Pattern matching.

Nebula's `match` is an **expression**—it produces a value and can be assigned directly.

```nebula
// ── Assign from match ────────────────────────────────────────────────────
str label = match (code)
{
    200       => "OK",
    404       => "Not Found",
    500 | 503 => "Server Error",
    _         => "Unknown"
};

// ── Destructure tagged union variants ────────────────────────────────────
f64 area = match (shape)
{
    Shape.Circle(r) => 3.14159 * r * r,
    Shape.Rect(w)   => w * w
};

// ── Idiomatic parsing with char match ────────────────────────────────────
match (line[0])
{
    '#'        => continue,
    '['        => handleSection(line),
    ' ' | '\t' => skip(),
    _          => handleKeyVal(line)
}
```

## 10. `if/else` as an Expression
`if/else` is not just a statement—it is an expression that yields a value. Eliminate temporary variables and ternary-operator gymnastics.

```nebula
// ── Direct assignment ────────────────────────────────────────────────────
i32 sign   = if (x > 0) { 1 } else { -1 };
str label  = if (count == 1) { "item" } else { "items" };

// ── Inside a larger expression ───────────────────────────────────────────
println($"Found {count} {if (count == 1) { "item" } else { "items" }}");

// ── As a return value (arrow-style) ─────────────────────────────────────
str classify(i32 n) => if (n < 0) { "negative" } else if (n == 0) { "zero" } else { "positive" }
```

Both branches must produce the same type; the compiler enforces this.

## 11. Simplified `for` Syntax
In addition to standard C-style `for` and `foreach`, Nebula offers a concise **range `for`** that eliminates boilerplate counter declarations.

```nebula
// ── Count up from 0: implicitly declares i32 i = 0, increments each loop ─
for (i < 10)
{
    println(i);
}

// ── Count up from a start value ──────────────────────────────────────────
for (j = 1 <= 5)   // j goes 1, 2, 3, 4, 5
{
    println(j);
}

// ── Count down ───────────────────────────────────────────────────────────
for (k = 10 > 0)   // k goes 10, 9, 8 … 1
{
    println(k);
}

// ── Iterate over a collection ────────────────────────────────────────────
foreach (var item in items)
{
    println(item);
}
```

The range `for` infers the counter type, handles increment/decrement automatically, and reads at a glance—no `i++` noise.

## 12. Let LUA Handle the Cleanup
**The Old Way:** Manual `close()` calls or fixed-size buffers `[512]` to avoid allocation.
**The Nebula Way:** Trust **Last-Usage Analysis (LUA)**.

There is no GC, no reference counting, and no `free()` in user code. The compiler traces the final instruction where each region is accessed and injects deallocation there, deferred to end-of-scope to keep code free of clutter.

```nebula
void process()
{
    var data = List<str>();   // region allocated on the stack (CVT-tracked)
    data.add("Hello");
    println(data[0]);
    // ← LUA injects free(data) here — last point data is used
}

// Heap-allocated via box: same rule, free injected at last use
void processHeap()
{
    box List<str> data = box List<str>();
    data.add("Hello");
    println(data[0]);
    // ← free(data) injected here
}
```

## 13. The `keeps` / `drops` / `mutates` Contract
Use parameter hints to explicitly communicate memory ownership at function call sites. This extends CVT causality through function boundaries and into FFI.

| Hint | Meaning | After the call |
| :--- | :--- | :--- |
| `keeps` | "I'm just reading." | Caller's view stays **Valid**. |
| `drops` | "I consume this." | Caller's view becomes **Invalid**. |
| `mutates` | "I may change the data." | Caller's view stays **Valid** but mutation is noted. |

```nebula
void log(keeps Resource r)    { println(r.id); }
void close(drops Resource r)  { println($"closing {r.id}"); }
void bump(mutates Resource r) { r.id += 1; }

void main()
{
    Resource r = (id: 1);
    bump(r);     // r.id is now 2, r is still Valid
    log(r);      // still Valid
    close(r);    // r is now Invalid
    // log(r);   // ❌ Compile error: r is Invalid
}
```

> The default hint when calling **extern C** functions is `drops`—this forces you to annotate FFI boundaries explicitly, rather than silently letting C consume your memory.
