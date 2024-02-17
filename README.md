# Assignment 3: Student Details CRUD Application

This Java program, allows users to perform CRUD (Create, Read, Update, Delete) operations on student records. The program displays a menu with options for adding, displaying, searching, updating, and deleting student records. The user is prompted to enter their choice, and the corresponding operation is performed using the Student class.

## `Main.java` Methods

### `main(String[] args)`
- **Description:** Initiates the program execution. Takes user inputs and performs CRUD operations using the `Student` class.
- **Parameters:**
  - `args`: Command-line arguments (not used in this program).
- **Execution Steps:**
  1. Creates an instance of `UserInput` and `Student` class to handle user input and student operations respectively.
  2. Displays a menu with options for CRUD operations in a loop.
  3. Reads user choice and performs selected operation on student records using a switch statement.
  4. Continues the loop until the user chooses to exit the program.


## `Student.java` Methods

### Constructors
- **`Student()`:** Initializes a student with default values.
- **`Student(int prn, String name, String dob, float marks)`:** Initializes a student with the given PRN, name, date of birth, and marks.

### Getter and Setter Methods
- **`setPrn(int prn)`:** Sets the PRN of the student.
- **`getPrn()`:** Gets the PRN of the student.
- **`setName(String name)`:** Sets the name of the student.
- **`getName()`:** Gets the name of the student.
- **`setDob(String dob)`:** Sets the date of birth of the student.
- **`getDob()`:** Gets the date of birth of the student.
- **`setMarks(float marks)`:** Sets the marks of the student.
- **`getMarks()`:** Gets the marks of the student.
- **`setStudents(ArrayList<Student> students)`:** Sets the list of students.
- **`getStudents()`:** Gets the list of students.

### `toString()`
- **Description:** Converts a student object to a string representation.
- **Parameters:** `None`
- **Returns:** A string containing the PRN, name, date of birth, and marks.

### `add(int studentsCount)`
- **Description:** Adds multiple students to the list based on user input.
- **Parameters:**
  - `studentsCount`: The number of students to be added.
- **Returns:** `None`

### `display()`
- **Description:** Prints the details of all students.
- **Parameters:** `None`
- **Returns:** `None`

### `search(int prn)`
- **Description:** Searches for a student with a given PRN.
- **Parameters:**
  - `prn`: The PRN of the student to be searched.
- **Returns:** The index of the student if found, -1 otherwise.

### `update(int prn)`
- **Description:** Updates details of a student with a given PRN.
- **Parameters:**
  - `prn`: The PRN of the student to be updated.
- **Returns:** `None`

### `delete(int prn)`
- **Description:** Deletes a student with a given PRN.
- **Parameters:**
  - `prn`: The PRN of the student to be deleted.
- **Returns:** `None`


## `UserInput.java` Methods

### `getScanner()`
- **Description:** Gets the Scanner object for reading input.
- **Parameters:** `None`
- **Returns:** A new Scanner object for reading input from the console.

### `getIntInput(String message)`
- **Description:** Gets an integer input from the user with a prompt message.
- **Parameters:**
  - `message`: The prompt message to display to the user.
- **Returns:** The integer input from the user.

### `getFloatInput(String message)`
- **Description:** Gets a float input from the user with a prompt message.
- **Parameters:**
  - `message`: The prompt message to display to the user.
- **Returns:** The float input from the user.

### `getStringInput(String message)`
- **Description:** Gets a string input from the user with a prompt message.
- **Parameters:**
  - `message`: The prompt message to display to the user.
- **Returns:** The string input from the user.

### `getStudentInput()`
- **Description:** Gets a Student object from the user.
- **Parameters:** `None`
- **Returns:** A Student object created based on user input.
