# DSA Practice in Java

A Java-based repository for practicing data structures and algorithms through compact, focused problem implementations. The goal is to keep each exercise easy to read, independently runnable, and useful for interview preparation or daily coding practice.

## Why this repository?

This project is designed to help with:

- interview preparation and coding drills
- learning common DSA patterns in Java
- revisiting concepts by topic and problem type
- running one file at a time without a heavy project setup

Each folder under `src/` groups related problems by concept, making it easy to study a topic in isolation and move quickly from theory to implementation.

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

## Topic coverage

The repository currently includes exercises across the following categories:

- `ArrayList/` — list operations and list-based problem patterns
- `Arrays/` — fundamentals, counting, searching, and problem-solving patterns
- `Arrays2D/` — matrix traversal and 2D array techniques
- `Backtracking/` — recursion + exhaustive search problems
- `DP/` — dynamic programming and optimization problems
- `Greedy/` — greedy-choice based solutions
- `HashMap/` — frequency counting, lookups, and hash-based logic
- `LinkedList/` — singly linked list patterns and pointer manipulation
- `Maths/` — arithmetic, number theory, and prime-based logic
- `PrefixSum/` — cumulative-sum techniques for subarray queries
- `Recursion/` — recursive problem solving and decomposition
- `SlidingWindow/` — fixed and variable window optimization strategies
- `Sorting/` — sorting algorithms and comparison-based tasks
- `Stack/` — stack operations, parsing, validation, and stack patterns
- `String/` — transformations, palindromes, parsing, and substring logic
- `TwoPointersAndSlidingWindow/` — classic two-pointer and sliding-window techniques

## What a typical exercise looks like

Most files follow a simple pattern:

- one focused problem or concept per class
- descriptive naming or topic-based naming
- direct console input/output using `Scanner` or command-line args
- independent compilation and execution

This keeps the repository useful as a quick reference and review tool, especially when preparing for interviews or practicing problem-solving under time pressure.

## Prerequisites

Use a Java JDK 21 or newer. Some exercises rely on modern Java features, so older Java runtimes may not be sufficient.

```bash
java -version
javac -version
```

If Java 8 is reported, install and point `JAVA_HOME` to a JDK 21+ environment before compiling.

```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
export PATH="$JAVA_HOME/bin:$PATH"
```

## Quick start

### Compile and run a single exercise

```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
export PATH="$JAVA_HOME/bin:$PATH"

javac -d out src/Arrays/TwoSum.java
java -cp out Arrays.TwoSum
```

### Run the root demo file

```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
export PATH="$JAVA_HOME/bin:$PATH"

javac -d out src/Main.java
java -cp out Main hello world
```

### Compile any Java file directly

```bash
javac -d out src/Stack/ValidParentheses.java
java -cp out Stack.ValidParentheses
```

> Note: this repo is built as a collection of standalone practice files, not a single production application. The most reliable workflow is to compile and run one file at a time.

## Recommended workflow

1. Pick a topic matching the pattern you want to practice.
2. Open a single Java file and study the approach.
3. Compile and run it with the provided command.
4. Reuse the pattern as a reference for similar problems.
5. Repeat the practice until the logic feels natural.

## Notes

- `out/` contains generated compiled artifacts and should not be edited manually.
- `.gitignore` ignores IDE and build output such as `out/` and `.idea/`.
- Some class names may be reused across packages; Java treats them as separate classes because they live in different packages.
- This repository is intentionally learning-focused rather than framework-driven.

## Author

Divyanshu Mishra

## License

This project is intended for educational and personal practice use.
