# Assignment 8 and 10: Employee Management System with JavaFX and MySQL

## Overview

This Java application serves as an Employee Management System (EMS) with a graphical user interface (GUI) built using JavaFX. It provides functionalities to create, register, view, update, and delete employee records stored in a MySQL database. The system ensures data integrity and handles potential errors using exception handling.


## Main.java

The `Main.java` class is the entry point of the application. It extends the `Application` class from JavaFX and overrides the `start` method to initialize the GUI. The GUI consists of text fields for entering employee details, buttons for performing operations such as creating/deleting tables, registering/viewing employees, and updating employee information. It also contains methods to interact with the MySQL database to execute SQL queries for CRUD operations on employee records.

### Methods

#### `start(Stage stage)`
- **Description:** Initializes the GUI components, sets up event handlers for buttons, and defines the layout of the interface.

#### `createEmployeeTable()`
- **Description:** Creates the `employees` table in the MySQL database if it doesn't already exist.

#### `deleteEmployeeTable()`
- **Description:** Deletes the `employees` table from the MySQL database if it exists.

#### `registerEmployee(String id, String name, String age, String email, String department)`
- **Description:** Registers a new employee by inserting their details into the `employees` table.

#### `employeeExists(Connection con, String id)`
- **Description:** Checks if an employee with the given ID exists in the `employees` table.

#### `isTableExists()`
- **Description:** Checks if the `employees` table exists in the MySQL database.

#### `displayError(String errorMessage)`
- **Description:** Displays an error message in a separate window.

#### `viewEmployees()`
- **Description:** Retrieves and displays the details of all registered employees from the `employees` table.

#### `updateEmployeeInfo(String id, String name, String age, String email, String department)`
- **Description:** Updates the information of an existing employee in the `employees` table based on their ID.
