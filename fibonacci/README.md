# Fibonacci project

This project has a Java program that calculates the Fibonacci sequence using two methods. The Fibonacci sequence is a series of numbers where each number is the sum of the two numbers before it, starting with 0 and 1. For example: 0, 1, 1, 2, 3, 5, 8, 13, and so on.

## Files and structure

This project has two main files:

1. **Fibonacci.java**: This file has two methods to calculate the Fibonacci sequence:

   - **Traditional Recursive Method**: It calculates each number by calling itself many times.
   - **Vector Method**: It uses a vector (a list of numbers) to calculate the sequence faster.

2. **App.java**: Runs the program and shows the results of both methods so you can see them.

## Methods explained

### Traditional recursive method

This method in `Fibonacci.java` calculates the Fibonacci sequence using recursion. This means it calls itself many times to find each number in the sequence. This way is slower for large numbers because it repeats calculations.

- **Example**: If we want the third number in the sequence, the method calculates the second and first numbers, then adds them.
- **In the code**: `Fibonacci.traditional(n)` where `n` is the number we want to calculate.

### Vector method

This method in `Fibonacci.java` uses a vector (like a list) to calculate the Fibonacci sequence faster. It saves each calculated number in the vector, so it does not repeat calculations.

- **Example**: It calculates the numbers up to number `n`, saving each number in the vector.
- **In the code**: `Fibonacci.vector(n)` where `n` is the number up to which we want the full sequence.

## Running the program

The file `App.java` runs both methods and shows the results in the console.

- First, it sets the number of terms (numbers) we want in the sequence (`n = 10` in this example).
- Then, it runs the recursive method and the vector method, showing both results.

## Example output

When we run the program for `n = 10`, the output is:

```
Fibonacci(10) = 55
0 1 1 2 3 5 8 13 21 34 55
```

This means:

- **"Fibonacci(10) = 55"**: The tenth number in the Fibonacci sequence is 55 (calculated with the recursive method).
- **"0 1 1 2 3 5 8 13 21 34 55"**: The Fibonacci sequence up to the tenth term, calculated with the vector method.
