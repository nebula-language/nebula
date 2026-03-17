# 🌌 Idiomatic Nebula: From C-Brain to Causal Logic

## 1. Stop Using "Magic Integers" for State
**The Old Way:** Returning `-1` for errors or `0/1/2` for types.
**The Nebula Way:** Use **Enums** and **Tagged Unions**.

In Nebula, a function should never return a "guessable" error code. Use a `union` to force the caller to handle success and failure at compile-time.

```nebula
// ❌ BAD: C-style (Magic numbers, no enforcement)
i64 openFile(string path); // Returns -1 on error

// ✅ GOOD: Nebula-style (Exhaustive, Safe)
union FileResult {
    Ok(File handle),
    Err(FsError reason)
}
```

## 2. Embrace the Optional (`T?`)
**The Old Way:** Returning an empty string `""` or a "Null Object."
**The Nebula Way:** Use `null` as a first-class validity state.

Because of **CVT (Causal Validity Tracking)**, an optional `string?` isn't just a pointer—it's a "MaybeInvalid" region. The compiler **prevents** you from calling methods on it until you "promote" it with a check.

```nebula
// ❌ BAD: Returns "" if not found. Caller doesn't know if key was missing or just empty.
string getVal(string key) => ... 

// ✅ GOOD: Returns null. Compiler forces a check.
string? getVal(string key) => ...

// Usage:
var v = getVal("API_KEY");
if (v != none) {
    // 'v' is now promoted to 'Valid' state in this scope
    print(v.length); 
}
```

## 3. Data Grouping over Indexing
**The Old Way:** Passing an `i64 index` to five different functions to get properties.
**The Nebula Way:** Use **Structs** as Aggregate Proxies.

Nebula strings and structs are zero-cost. A `struct` that holds an ID and some metadata doesn't allocate on the heap; it just organizes your stack.



```nebula
// ❌ BAD: Procedural indexing
str name = reflect::get_name(i);
i32 kind = reflect::get_kind(i);

// ✅ GOOD: Object-oriented aggregation
struct Symbol {
    i64 id;
    string name;
    SymbolKind kind;
}

Symbol? sym = reflect::get(i);
```

## 4. Let LUA Handle the Cleanup
**The Old Way:** Manual `close()` calls or fixed-size buffers `[512]` to avoid allocation.
**The Nebula Way:** Trust **Last-Usage Analysis**.

You don't need to fear `new List<T>()`. Nebula has no Garbage Collector; the compiler identifies the exact instruction where your list is last used and injects the `free()` call there. 

```nebula
void process() {
    var data = new List<string>(); // Region allocated
    data.add("Hello");
    print(data[0]); 
    // <-- LUA: Compiler injects free(data) here automatically.
}
```

## 5. Match is your Best Friend
**The Old Way:** Deeply nested `if/else` blocks checking ASCII codes like `if (ch == 91)`.
**The Nebula Way:** Pattern matching.

Nebula's `match` is an expression. Use it to map raw data to high-level logic instantly.

```nebula
// ✅ Idiomatic Parsing
match (line[0]) {
    '#' => continue,
    '[' => handleSection(line),
    ' ' | '\t' => skip(),
    _   => handleKeyVal(line)
}
```

## 6. The `keeps` vs `drops` Contract
Nebula is safer than C because it tracks **Causality**. Use parameter hints to tell the compiler your intent:

| Hint | Meaning | Result |
| :--- | :--- | :--- |
| `keeps` | "I'm just looking." | Caller keeps the memory. |
| `drops` | "I'm taking this." | Caller's variable becomes **Invalid** immediately. |