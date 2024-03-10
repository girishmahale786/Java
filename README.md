# Assignment 7: Calculator with Exception Handling

## Overview

This Java program serves as a versatile calculator, capable of performing both arithmetic and statistical operations. It includes features for user input handling, arithmetic calculations (addition, subtraction, multiplication, division, and exponentiation), and statistical calculations (mean, variance, and standard deviation).

The program employs exception handling to address potential errors, such as invalid input or unsupported operations during user input and calculations. It catches `InputMismatchException` for invalid input and `IllegalArgumentException` for unsupported operations, providing informative error messages to the user.


## Contents

- [Main.java](#mainjava)
- [Calculator.java](#calculatorjava)
- [UserInput.java](#userinputjava)


## Main.java

The `Main.java` class is the entry point for the calculator program. It initializes instances of `UserInput` and `Calculator` to handle user input and perform calculations, respectively. The program prompts users to choose between arithmetic and statistical operations, then guides them through the process, displaying results accordingly. Exception handling is implemented to address input mismatch and illegal argument issues.

### Methods

#### `main(String[] args)`
- **Description:** Initiates the calculator program by handling user input, choosing the type of operation, and performing the selected operation.

#### `printArray(double[] array)`
- **Description:** Utility method to print an array of double values.


## Calculator.java

The `Calculator.java` class contains methods to perform various arithmetic and statistical operations. It includes methods for addition, subtraction, multiplication, division, exponentiation, mean, variance, and standard deviation. The class utilizes the `Arrays` class for statistical calculations.

### Methods

#### Arithmetic Operations
- `add(double n1, double n2)`: Adds two numbers.
- `subtract(double n1, double n2)`: Subtracts the second number from the first.
- `multiply(double n1, double n2)`: Multiplies two numbers.
- `divide(double n1, double n2)`: Divides the first number by the second.
- `sqrt(double n)`: Calculates the square root of a number.
- `power(double n1, double n2)`: Raises the first number to the power of the second.

#### Statistical Operations
- `mean(double[] arr)`: Calculates the mean (average) of an array of numbers.
- `variance(double[] arr)`: Calculates the variance of an array of numbers.
- `stddev(double[] arr)`: Calculates the standard deviation of an array of numbers.


## UserInput.java

The `UserInput.java` class manages user input for the calculator program. It includes methods to obtain integer, double, string, and array inputs from the user. The class utilizes the `Scanner` class for input reading.

### Methods

#### `getScanner()`
- **Description:** Returns a `Scanner` object for reading input.

#### `getIntInput(String message)`
- **Description:** Gets an integer input from the user with a specified prompt message.

#### `getDoubleInput(String message)`
- **Description:** Gets a double input from the user with a specified prompt message.

#### `getStringInput(String message)`
- **Description:** Gets a string input from the user with a specified prompt message.

#### `getArrayInput()`
- **Description:** Gets an array input from the user by specifying the size and entering elements.
