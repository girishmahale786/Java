# Assignment 1: Fibonacci and Calculator

## Contents

- [Part 1: Fibonacci Sequence Generator](#part-1-fibonacci-sequence-generator)
- [Part 2: Calculator Application](#part-2-calculator-application)


## Part 1: Fibonacci Sequence Generator

This Java program calculates and prints the first `n` Fibonacci numbers, where `n` is provided by the user.

## `Fibonacci.java` Methods

### `main(String[] args)`
- **Description:** Initiates the program execution. Takes user input for the number of Fibonacci terms to generate and prints the first `n` Fibonacci numbers.
- **Parameters**:
  - `args`: Command-line arguments (not used in this program).
- **Execution Steps**:
  1. Creates an instance of `UserInput` to handle user input.
  2. Gets the user's choice of number of Fibonacci terms to generate.
  3. Prints the first `n` Fibonacci numbers.

### `fibonacci(int n)`
- **Description:** A recursive method to calculate the `nth` Fibonacci number.
- **Parameters**:
    - `n`: The number of Fibonacci terms to generate.
- **Returns**: The `nth` Fibonacci number.


## Part 2: Calculator Application

This is a simple calculator application that allows users to perform basic arithmetic operations and statistical calculations.

## `Main.java` Methods

### `main(String[] args)`
- **Description**: Main method to initiate program execution.
- **Parameters**:
  - `args`: Command-line arguments (not used in this program).
- **Execution Steps**:
  1. Creates an instance of `UserInput` to handle user input.
  2. Creates an instance of `Calculator` to perform arithmetic and statistical operations.
  3. Gets the user's choice of operation (arithmetic or statistical).
  4. Depending on the choice:
      - For arithmetic operations:
          - Gets user input for two numbers.
          - Gets the user's choice of arithmetic operation.
          - Performs the chosen operation using the `Calculator` class.
          - Displays the result.
      - For statistical operations:
          - Gets user input for an array of numbers.
          - Gets the user's choice of statistical operation (mean, variance, or standard deviation).
          - Performs the chosen statistical operation using the `Calculator` class.
          - Displays the result.
  5. Handles invalid choices and displays error messages.

### `printArray(double[] array)`
- **Description**: Method to print an array.
- **Parameters**:
  - `array`: The array of doubles to be printed.
- **Output**: Prints the elements of the array in a formatted manner.


## `Calculator.java` Methods

### `add(double n1, double n2)`
- **Description**: Adds two numbers.
- **Parameters**:
  - `n1`: First number.
  - `n2`: Second number.
- **Returns**: The sum of `n1` and `n2`.

### `subtract(double n1, double n2)`
- **Description**: Subtracts `n2` from `n1`.
- **Parameters**:
  - `n1`: The number to be subtracted from.
  - `n2`: The number to subtract.
- **Returns**: The result of `n1 - n2`.

### `multiply(double n1, double n2)`
- **Description**: Multiplies two numbers.
- **Parameters**:
  - `n1`: First number.
  - `n2`: Second number.
- **Returns**: The product of `n1` and `n2`.

### `divide(double n1, double n2)`
- **Description**: Divides `n1` by `n2`.
- **Parameters**:
  - `n1`: The dividend.
  - `n2`: The divisor.
- **Returns**: The result of `n1 / n2`.

### `sqrt(double n)`
- **Description**: Calculates the square root of a number.
- **Parameters**:
  - `n`: The number to calculate the square root of.
- **Returns**: The square root of `n`.

### `power(double n1, double n2)`
- **Description**: Calculates the power of a number.
- **Parameters**:
  - `n1`: The base.
  - `n2`: The exponent.
- **Returns**: `n1` raised to the power of `n2`.

### `mean(double[] arr)`
- **Description**: Calculates the mean (average) of an array of numbers.
- **Parameters**:
  - `arr`: An array of numbers.
- **Returns**: The mean of the numbers in the array.

### `variance(double[] arr)`
- **Description**: Calculates the variance of an array of numbers.
- **Parameters**:
  - `arr`: An array of numbers.
- **Returns**: The variance of the numbers in the array.

### `stddev(double[] arr)`
- **Description**: Calculates the standard deviation of an array of numbers.
- **Parameters**:
  - `arr`: An array of numbers.
- **Returns**: The standard deviation of the numbers in the array.


## `UserInput.java` Methods

### `getScanner()`
- **Description**: Gets the Scanner object for reading input.
- **Parameters**: None.
- **Returns**: A new Scanner object for reading input from the console.

### `getIntInput(String message)`
- **Description**: Gets an integer input from the user with a prompt message.
- **Parameters**:
  - `message`: The prompt message to display to the user.
- **Returns**: The integer input from the user.

### `getDoubleInput(String message)`
- **Description**: Gets a double input from the user with a prompt message.
- **Parameters**:
  - `message`: The prompt message to display to the user.
- **Returns**: The double input from the user.

### `getStringInput(String message)`
- **Description**: Gets a string input from the user with a prompt message.
- **Parameters**:
  - `message`: The prompt message to display to the user.
- **Returns**: The string input from the user.

### `getArrayInput()`
- **Description**: Gets an array input from the user.
  - Prompts the user for the size of the array.
  - Creates an array to store the input elements.
  - Prompts the user to enter each element of the array.
  - Checks if each input is a double and stores it in the array.
- **Parameters**: None.
- **Returns**: An array of doubles entered by the user.
