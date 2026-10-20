# DSA Practice in Java

A focused Java repository for solving data structures and algorithm problems in a clean, readable, and repeatable way. The goal is to practice interview-style questions without the overhead of a full application framework or build system.

## Overview

This repository is designed for:

- interview preparation
- daily coding practice
- learning common DSA patterns in Java
- revisiting problems by topic without distractions

Each file is typically a self-contained solution and is organized by category under `src/`.

## Repository structure

```text
DSA/
├── .git/
├── .gitignore
├── .idea/
├── .vscode/
├── Arrays.iml
├── README.md
├── out/
├── src/
│   ├── ArrayList/
│   ├── Arrays/
│   ├── Arrays2D/
│   ├── Backtracking/
│   ├── DP/
│   ├── Greedy/
│   ├── HashMap/
│   ├── LinkedList/
│   ├── Maths/
│   ├── PrefixSum/
│   ├── Recursion/
│   ├── SlidingWindow/
│   ├── Sorting/
│   ├── Stack/
│   ├── String/
│   ├── TwoPointersAndSlidingWindow/
│   ├── Main.java
│   └── ...
└──
```

## Topics covered

The project includes exercises in:

- `ArrayList/` — list operations and list-based patterns
- `Arrays/` — fundamentals, searching, counting, and common array problems
- `Arrays2D/` — matrix traversal and grid-based problems
- `Backtracking/` — recursive search and exhaustive enumeration
- `DP/` — dynamic programming and optimization techniques
- `Greedy/` — local-choice optimization problems
- `HashMap/` — map-based frequency and lookup patterns
- `LinkedList/` — linked-list manipulation and traversal
- `Maths/` — arithmetic, number theory, and math-driven tasks
- `PrefixSum/` — prefix-sum and cumulative techniques
- `Recursion/` — recursive decomposition and problem solving
- `SlidingWindow/` — fixed and variable window optimization
- `Sorting/` — sorting algorithms and comparison logic
- `Stack/` — parsing, validation, and stack-based solutions
- `String/` — string manipulation and pattern matching
- `TwoPointersAndSlidingWindow/` — two-pointer and sliding-window styles

## Typical problem structure

Most files follow a simple style:

- one focused problem or concept per class
- direct console input/output
- compile and run independently
- minimal dependencies and no framework setup

This makes the repo a strong personal reference for reviewing patterns and sharpening coding logic.

## Prerequisites

Use Java 21 or newer.

```bash
java -version
javac -version
```

If your environment still points to Java 8, configure a newer JDK before compiling:

```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
export PATH="$JAVA_HOME/bin:$PATH"
```

## Quick start

### Compile and run a single file

```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
export PATH="$JAVA_HOME/bin:$PATH"

javac -d out src/Arrays/TwoSum.java
java -cp out Arrays.TwoSum
```

### Run the root demo

```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
export PATH="$JAVA_HOME/bin:$PATH"

javac -d out src/Main.java
java -cp out Main hello world
```

### Compile any Java class directly

```bash
javac -d out src/Stack/ValidParentheses.java
java -cp out Stack.ValidParentheses
```

> This repository is intentionally built as a collection of standalone practice files, not as a single app. The recommended workflow is to compile and run one file at a time.

## Suggested workflow

1. Choose a topic folder related to the concept you want to practice.
2. Open a single Java file and understand the approach.
3. Compile and run it locally.
4. Reuse the logic as a pattern for similar problems.
5. Repeat until the solution becomes instinctive.

## Notes

- `out/` contains generated compiled class files and should not be edited manually.
- `.gitignore` excludes IDE and build artifacts such as `out/` and `.idea/`.
- Some class names may repeat across packages; Java treats them as separate classes because they are in different package namespaces.
- The project is focused on learning and practice, not production architecture.

## Author

Divyanshu Mishra

## License

This project is intended for educational and personal practice use.
