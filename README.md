# Java String Processing, Loops, and Arrays

**Author:** Daniel Chung  
**Course:** CSCI 125 – Programming I  
**Section:** M01  
**Institution:** New York Institute of Technology  
**Language:** Java

## Overview

This collection contains five standalone Java console programs developed for introductory programming coursework. The exercises explore filtering characters, generating patterns, working with two-dimensional arrays, and checking palindromes.

## Programs

| Uploaded File | Program | Description |
|---------------|---------|-------------|
| `Main (3).java` | Lowercase Letter Filter | Extracts lowercase English letters from an entered line of text. |
| `DanielChung_Prob2-2.java` | Multiplication Table | Stores and prints a 5 × 5 multiplication table using a two-dimensional array. |
| `Main-1.java` | Star Triangle | Prints a right-angled triangle of stars with a user-selected number of rows. |
| `Main-2.java` | Chessboard Pattern | Prints an 8 × 8 alternating pattern of `#` and `-` symbols. |
| `Daniel_Chung_Lab5Prob5.java` | Palindrome Checker | Checks whether entered text reads the same forward and backward after conversion to lowercase. |

## Concepts Practiced

- Console input using `Scanner`
- Strings and character arrays
- Two-dimensional integer arrays
- Standard and enhanced for loops
- Nested while loops
- Conditional statements
- Modulo arithmetic
- String reversal and comparison
- Constants and Boolean flags

## Program Details

### 1. Lowercase Letter Filter

Reads a full line of text and retains only characters from `a` through `z`, preserving their original order.

Uppercase letters, spaces, digits, and punctuation are excluded. Uppercase letters are not converted to lowercase.

Example:

```text
Input:  Hello World 123!
Result: elloorld
```

If no lowercase English letters are found, the program displays a message instead of a filtered result.

### 2. Multiplication Table

Uses nested for loops to populate a 5 × 5 integer array with products of the numbers 1 through 5, then prints the table.

```text
1 2 3 4 5
2 4 6 8 10
3 6 9 12 15
4 8 12 16 20
5 10 15 20 25
```

This program does not require user input.

### 3. Star Triangle

Accepts a row count and uses nested while loops to print an increasing number of stars on each line.

For an input of `5`:

```text
*
**
***
****
*****
```

Zero or negative row counts produce no triangle.

### 4. Chessboard Pattern

Uses nested while loops to generate an 8 × 8 pattern. The expression `(row + column) % 2` determines which symbol appears at each position.

```text
# - # - # - # -
- # - # - # - #
# - # - # - # -
- # - # - # - #
# - # - # - # -
- # - # - # - #
# - # - # - # -
- # - # - # - #
```

The board size is fixed at 8, and no user input is required.

### 5. Palindrome Checker

Reads a line of text, converts it to lowercase, and builds a reversed copy using a loop. It then compares the two strings.

| Example Input | Result |
|---------------|--------|
| `Racecar` | Palindrome |
| `level` | Palindrome |
| `hello` | Not a palindrome |

Spaces and punctuation remain part of the comparison.

## How to Run

### Requirements

Install a Java Development Kit (JDK) with `javac` and `java` available in your terminal. No external libraries are required.

### Organize and Rename Files

Three programs declare `public class Main`. Keep them in separate folders and rename each source file to `Main.java`.

Use the following suggested organization:

| Folder | Uploaded File | Required Filename |
|--------|---------------|-------------------|
| `lowercase-filter` | `Main (3).java` | `Main.java` |
| `multiplication-table` | `DanielChung_Prob2-2.java` | `DanielChung_Prob2.java` |
| `star-triangle` | `Main-1.java` | `Main.java` |
| `chessboard-pattern` | `Main-2.java` | `Main.java` |
| `palindrome-checker` | `Daniel_Chung_Lab5Prob5.java` | `Daniel_Chung_Lab5Prob5.java` |

### Compile and Run Individually

Open a terminal inside the folder for the program you want to run.

For the lowercase filter, star triangle, or chessboard pattern:

```sh
javac Main.java
java Main
```

For the multiplication table:

```sh
javac DanielChung_Prob2.java
java DanielChung_Prob2
```

For the palindrome checker:

```sh
javac Daniel_Chung_Lab5Prob5.java
java Daniel_Chung_Lab5Prob5
```

## Current Limitations

- The lowercase filter recognizes only English letters `a`–`z`.
- Its no-match message assumes the input is uppercase, although digits, punctuation, or an empty line can also produce no matches.
- The star-triangle program does not handle non-integer input or reject nonpositive row counts.
- The palindrome checker does not remove spaces or punctuation and treats an empty string as a palindrome.
- The multiplication table and chessboard use fixed dimensions.

## Learning Objective

Develop familiarity with iteration, arrays, and string manipulation by implementing small programs that transform text, generate patterns, and organize numeric results.
