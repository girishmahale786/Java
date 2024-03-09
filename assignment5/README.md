# Assignment 5: Shape Calculator

This Java program, allows users to perform various actions related to geometric shapes, including calculating area, perimeter, and volume where applicable. The program provides an interactive interface for users to explore and calculate the properties of various geometric shapes.

## Contents

- [Main.java](#mainjava)
- [Shape.java](#shapejava)
- [Volume.java](#volumejava)
- [Circle.java](#circlejava)
- [Rectangle.java](#rectanglejava)
- [Square.java](#squarejava)
- [Sphere.java](#spherejava)
- [Cylinder.java](#cylinderjava)
- [Pyramid.java](#pyramidjava)
- [UserInput.java](#userinputjava)

## Main.java

The `Main.java` class is the main entry point for the Shape Calculator program. It allows users to interactively select various geometric shapes, enter their dimensions, and calculates their area and volume where applicable. Users can choose from options such as Circle, Rectangle, Square, Sphere, Cylinder, Pyramid, or exit the program.

### Methods

#### `main(String[] args)`
- **Description:** Initiates the program execution.
- **Parameters:**
  - `args`: Command-line arguments (not used in this program).
- **Execution Steps:**
  1. Creates an instance of `UserInput` to handle user input.
  2. Displays a menu with shape options in a loop.
  3. Reads user choice and performs corresponding shape calculations.
  4. Continues the loop until the user chooses to exit the program.


## Shape.java

The `Shape.java` class is an abstract class representing a geometric shape. It includes methods to show the selected shape, calculate its area, and calculate its perimeter.

### Methods

#### `showShape(String shape)`
- **Description:** Displays the selected shape.
- **Parameters:**
  - `shape`: The name of the selected shape.
- **Returns:** `None`

#### `calculateShape()`
- **Description:** Abstract method to be implemented by subclasses for calculating the area.
- **Parameters:** `None`
- **Returns:** The calculated area.

#### `calculatePerimeter()`
- **Description:** Abstract method to be implemented by subclasses for calculating the perimeter.
- **Parameters:** `None`
- **Returns:** The calculated perimeter.


## Volume.java

The `Volume.java` interface represents the concept of a shape with volume. It includes a method to calculate the volume of a shape.

### Methods

#### `calculateVolume()`
- **Description:** Abstract method to be implemented by classes for calculating the volume.
- **Parameters:** `None`
- **Returns:** The calculated volume.


## Circle.java

The `Circle.java` class extends `Shape` and represents a circle. It includes methods to calculate the area and perimeter of a circle.

### Methods

#### Constructor
- **`Circle(double radius)`:** Initializes a circle with the given radius.

#### `calculateShape()`
- **Description:** Calculates the area of the circle.
- **Parameters:** `None`
- **Returns:** The calculated area.

#### `calculatePerimeter()`
- **Description:** Calculates the perimeter of the circle.
- **Parameters:** `None`
- **Returns:** The calculated perimeter.

#### `calculate()`
- **Description:** Displays the area and perimeter of the circle.
- **Parameters:** `None`
- **Returns:** `None`


## Rectangle.java

The `Rectangle.java` class extends `Shape` and represents a rectangle. It includes methods to calculate the area and perimeter of a rectangle.

### Methods

#### Constructor
- **`Rectangle(double length, double width)`:** Initializes a rectangle with the given length and width.

#### `calculateShape()`
- **Description:** Calculates the area of the rectangle.
- **Parameters:** `None`
- **Returns:** The calculated area.

#### `calculatePerimeter()`
- **Description:** Calculates the perimeter of the rectangle.
- **Parameters:** `None`
- **Returns:** The calculated perimeter.

#### `calculate()`
- **Description:** Displays the area and perimeter of the rectangle.
- **Parameters:** `None`
- **Returns:** `None`


## Square.java

The `Square.java` class extends `Shape` and represents a square. It includes methods to calculate the area and perimeter of a square.

### Methods

#### Constructor
- **`Square(double side)`:** Initializes a square with the given side length.

#### `calculateShape()`
- **Description:** Calculates the area of the square.
- **Parameters:** `None`
- **Returns:** The calculated area.

#### `calculatePerimeter()`
- **Description:** Calculates the perimeter of the square.
- **Parameters:** `None`
- **Returns:** The calculated perimeter.

#### `calculate()`
- **Description:** Displays the area and perimeter of the square.
- **Parameters:** `None`
- **Returns:** `None`


## Sphere.java

The `Sphere.java` class extends `Shape` and implements the `Volume` interface. It represents a sphere and includes methods to calculate the surface area and volume of a sphere.

### Methods

#### Constructor
- **`Sphere(double radius)`:** Initializes a sphere with the given radius.

#### `calculateShape()`
- **Description:** Calculates the surface area of the sphere.
- **Parameters:** `None`
- **Returns:** The calculated surface area.

#### `calculatePerimeter()`
- **Description:** Perimeter calculation for a 3D shape is not applicable.
- **Parameters:** `None`
- **Returns:** Always returns 0.

#### `calculateVolume()`
- **Description:** Calculates the volume of the sphere.
- **Parameters:** `None`
- **Returns:** The calculated volume.

#### `calculate()`
- **Description:** Displays the surface area and volume of the sphere.
- **Parameters:** `None`
- **Returns:** `None`


## Cylinder.java

The `Cylinder.java` class extends `Shape` and implements the `Volume` interface. It represents a cylinder and includes methods to calculate the surface area and volume of a cylinder.

### Methods

#### Constructor
- **`Cylinder(double radius, double height)`:** Initializes a cylinder with the given radius and height.

#### `calculateShape()`
- **Description:** Calculates the surface area of the cylinder.
- **Parameters:** `None`
- **Returns:** The calculated surface area.

#### `calculatePerimeter()`
- **Description:** Perimeter calculation for a 3D shape is not applicable.
- **Parameters:** `None`
- **Returns:** Always returns 0.

#### `calculateVolume()`
- **Description:** Calculates the volume of the cylinder.
- **Parameters:** `None`
- **Returns:** The calculated volume.

#### `calculate()`
- **Description:** Displays the surface area and volume of the cylinder.
- **Parameters:** `None`
- **Returns:** `None`


## Pyramid.java

The `Pyramid.java` class extends `Shape` and implements the `Volume` interface. It represents a pyramid and includes methods to calculate the surface area and volume of a pyramid.

### Methods

#### Constructor
- **`Pyramid(double baseLength, double baseWidth, double height)`:** Initializes a pyramid with the given base length, base width, and height.

#### `calculateShape()`
- **Description:** Calculates the surface area of the pyramid.
- **Parameters:** `None`
- **Returns:** The calculated surface area.

#### `calculatePerimeter()`
- **Description:** Perimeter calculation for a 3D shape is not applicable.
- **Parameters:** `None`
- **Returns:** Always returns 0.

#### `calculateVolume()`
- **Description:** Calculates the volume of the pyramid.
- **Parameters:** `None`
- **Returns:** The calculated volume.

#### `calculate()`
- **Description:** Displays the surface area and volume of the pyramid.
- **Parameters:** `None`
- **Returns:** `None`


## UserInput.java

The `UserInput.java` class handles user input for the Shape Calculator program. It provides methods to get integer and double inputs from the user.

### Methods

#### `getIntInput(String message)`
- **Description:** Gets an integer input from the user with a prompt message.
- **Parameters:**
  - `message`: The prompt message to display to the user.
- **Returns:** The integer input from the user.

#### `getDoubleInput(String message)`
- **Description:** Gets a double input from the user with a prompt message.
- **Parameters:**
  - `message`: The prompt message to display to the user.
- **Returns:** The double input from the user.

