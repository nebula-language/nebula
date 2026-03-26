## Nebula Project – AI-Enforceable Development Guidelines

### 1. Project Structure

The repository (**Nebula**) MUST be treated as a single, unified project. Components are:

* `nebc/` — Java compiler.
* `std/` — Standard library, written in Nebula.

  * `std/runtime/` MUST provide only the **minimum runtime necessary** for native compilation.
  * Nebula MUST remain **platform-agnostic** (no `libc` dependencies).
* Current development SHOULD target **Linux** for speed but design MUST remain cross-platform compatible.

---

### 2. Coding Standards

All code MUST adhere to the following:

1. MUST be **modular, production-grade, and scalable**.
2. MUST prioritize **well-structured solutions** over hacks or temporary fixes.
3. SHOULD extract repeating patterns into **helper methods or reusable modules**.
4. MUST avoid **duplicate logic** and tightly coupled code.
5. MUST follow **Allman style** for all supported languages (Java, Nebula, etc.).

---

### 3. Pre-Coding Requirements

Before writing any code:

1. MUST read `./spec/Nebula_CVT_LUA_Specification.md` → Understand Nebula’s **core philosophy and paradigm**.
2. MUST read `./spec/full.neb` → Understand **all language features** (syntax + semantics).
3. MUST validate that your implementation aligns with Nebula’s **intended direction and philosophy**.

**Failure to follow this step is not allowed.**

---

### 4. Compiler Workflow (`nebc/`)

You MUST operate within:

```bash
cd ./nebula/nebc/
```

#### Fast iteration:

```bash
mvn compile
```

* MUST run using the Java runtime.

#### Native binary build:

```bash
mvn clean package native:compile
```

* Output MUST be `nebc/target/nebc`.
* MUST be symlinked to `/usr/local/bin/nebc`.
* MUST update system path automatically.

---

### 5. Standard Library Compilation

To compile `std/`:

```bash
nebc --library std/ -o neb --nostdlib
```

* `--nostdlib` MUST be used.
* MUST prevent linking standard library with itself to avoid **redefinition errors**.
* Equivalent Java `.jar` commands MAY be used for testing but MUST respect the same flags.

---

### 6. Shell Environment

* Default shell is **fish**.

  * MUST use `$status` instead of `$?`.
  * MUST account for fish syntax differences.
* If fish compatibility fails, prepend commands with bash:

```bash
/bin/bash -c "your command"
```

---

### 7. Core AI Enforcement Rules

* MUST ALWAYS **prioritize correctness, clarity, and maintainability**.
* MUST NEVER implement **quick hacks** or temporary solutions.
* MUST modularize and refactor repetitive code.
* MUST follow **Allman style** in all languages.
* MUST validate against `cvt.md` and `full.neb` before generating code.

> **Violation of any of these rules MUST be corrected automatically before final output.**