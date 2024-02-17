# Assignment 2: Odd Even Arrays, Nearest Neighbours and Array to ArrayList

## Contents

- [Part 1: Odd Even Arrays](#part-1-odd-even-arrays)
- [Part 2: Nearest Neighbours](#part-2-nearest-neighbours)
- [Part 3: Array to ArrayList and vice versa](#part-3-array-to-arraylist-and-vice-versa)


## Part 1: Odd Even Arrays

This Java program, `OddEven.java`, separates even and odd numbers from an array provided by the user and prints them.

## `OddEven.java` Methods

### `main(String[] args)`
- **Description:** Initiates the program execution. Takes user input for the size of the array and the array elements and separates even and odd numbers into their respective arrays.
- **Parameters:**
  - `args`: Command-line arguments (not used in this program).
- **Execution Steps:**
  1. Creates an instance of `UserInput` class to handle user input.
  2. Reads the size of the array and the array elements from user input.
  3. Separates and prints even and odd numbers.

### `arrayString(double[] array, int size)`
- **Description:** Converts an array to a string representation.
- **Parameters:**
  - `array`: The array of doubles to be converted to a string.
  - `size`: The size of the array.
- **Returns:** A string representation of the array.


## Part 2: Nearest Neighbours

This Java program, `Neighbours.java`, finds the index of the nearest neighbours in an array based on the absolute difference between adjacent elements.

## `Neighbours.java` Methods

### `main(String[] args)`
- **Description:** Initiates the program execution.
- **Parameters:**
  - `args`: Command-line arguments (not used in this program).
- **Execution Steps:**
  1. Creates an instance of `UserInput` class to handle user input.
  2. Reads the size of the array and the array elements from user input.
  3. Finds and prints the index of the nearest neighbours in the array.

### `findNearestNeighbours(double[] arr)`
- **Description:** Finds the index of nearest neighbours in the array.
- **Parameters:**
  - `arr`: The array of doubles.
- **Returns:** The index of the nearest neighbours.


## Part 3: Array to ArrayList and vice versa

This Java program, `ArrayListArray.java`, demonstrates the conversion between primitive arrays and ArrayList in Java.

## `ArrayListArray.java` Methods

### `main(String[] args)`
- **Description:** Initiates the program execution.
- **Parameters:**
  - `args`: Command-line arguments (not used in this program).
- **Execution Steps:**
  1. Creates an instance of `UserInput` class to handle user input.
  2. Reads the size of the array and the array elements from user input.
  3. Converts the primitive double array to an ArrayList and prints it.
  4. Converts the ArrayList back to an array and prints it.

### `arrayToArrayList(double[] array)`
- **Description:** Converts an array to an ArrayList.
- **Parameters:**
  - `array`: The array of doubles to be converted.
- **Returns:** An ArrayList containing the elements of the array.

### `arrayListToArray(ArrayList<Double> arrayList)`
- **Description:** Converts an ArrayList to an array.
- **Parameters:**
  - `arrayList`: The ArrayList of doubles to be converted.
- **Returns:** An array of doubles containing the elements of the ArrayList.


## `UserInput.java` Methods

### `getIntInput(String message)`
- **Description**: Gets an integer input from the user with a prompt message.
- **Parameters**:
  - `message`: The prompt message to display to the user.
- **Returns**: The integer input from the user.

### `getArrayInput(int size)`
- **Description**: Gets an array input from the user with a specified size.
- **Parameters**:
  - `size`: The size of the array.
- **Returns**: An array of doubles entered by the user.
