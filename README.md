
---

# Java Exception Handling — Try-Catch Example

## Description

This project demonstrates the concept of **exception handling** in Java using `try-catch` blocks. It shows how to safely handle runtime exceptions such as division by zero and how to measure execution time for the operation.

## Features

* Reads two integers from user input.
* Attempts division of the two numbers.
* Catches and handles `ArithmeticException` (e.g., division by zero).
* Measures and displays the time taken for the input and calculation.
* Demonstrates method call hierarchy and stack trace by chaining methods (`a()`, `b()`, `c()`, `d()`).

## Code Structure

* `TryCatch` class: Contains all methods and the main method.

  * Methods `a()`, `b()`, `c()` simply call the next method down the chain.
  * `d()` performs input reading, division, exception handling, and time measurement.

## How to Run

1. Compile the class:

   ```bash
   javac Concepts/ExceptionHandling/TryCatch.java
   ```

2. Run the program:

   ```bash
   java Concepts.ExceptionHandling.TryCatch
   ```

3. Sample run:

   ```
   Enter the first number: 10
   Enter the second number: 0
   Arithmetic Exception is : / by zero
   Time taken : 123 ms
   ```

## Requirements

* Java JDK 8 or above
* Basic understanding of Java exceptions and handling mechanisms

## Notes

* The example shows how exceptions can be caught to prevent program crashes.
* The call stack illustrates how exceptions propagate through method calls.
