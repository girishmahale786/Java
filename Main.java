/**
* @author  Girish Mahale
* @branch  AIML B3
* @batch   2022-26
* @prn     23070126504
*/

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        UserInput userInput = new UserInput();

        while (true) {
            // Display the menu options to the user
            System.out.println("Select a shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("7. Exit");

            int choice = userInput.getIntInput("Enter your choice: ");

            // Perform actions based on the user's choice
            switch (choice) {
                case 1:
                    // Get the radius of the circle from the user
                    double radius = userInput.getDoubleInput("Enter the radius of the circle: ");

                    // Create a Circle object and calculate its area and perimeter
                    Circle circle = new Circle(radius);
                    circle.calculate();
                    break;
                case 2:
                    // Get the length and width of the rectangle from the user
                    double length = userInput.getDoubleInput("Enter the length of the rectangle: ");
                    double width = userInput.getDoubleInput("Enter the width of the rectangle: ");

                    // Create a Rectangle object and calculate its area and perimeter
                    Rectangle rectangle = new Rectangle(length, width);
                    rectangle.calculate();
                    break;
                case 3:
                    // Get the side of the square from the user
                    double side = userInput.getDoubleInput("Enter the side of the square: ");

                    // Create a Square object and calculate its area and perimeter
                    Square square = new Square(side);
                    square.calculate();
                    break;
                case 4:
                    // Get the radius of the sphere from the user
                    double radiusSphere = userInput.getDoubleInput("Enter the radius of the sphere: ");

                    // Create a Sphere object and calculate its area and volume
                    Sphere sphere = new Sphere(radiusSphere);
                    sphere.calculate();
                    break;
                case 5:
                    // Get the radius and height of the cylinder from the user
                    double radiusCylinder = userInput.getDoubleInput("Enter the radius of the cylinder: ");
                    double heightCylinder = userInput.getDoubleInput("Enter the height of the cylinder: ");

                    // Create a Cylinder object and calculate its area and volume
                    Cylinder cylinder = new Cylinder(radiusCylinder, heightCylinder);
                    cylinder.calculate();
                    break;
                case 6:
                    // Get the base length, base width, and height of the pyramid from the user
                    double baseLength = userInput.getDoubleInput("Enter the base lenght of the pyramid: ");
                    double baseWidth = userInput.getDoubleInput("Enter the base width of the pyramid: ");
                    double height = userInput.getDoubleInput("Enter the height of the pyramid: ");

                    // Create a Pyramid object and calculate its area and volume
                    Pyramid pyramid = new Pyramid(baseLength, baseWidth, height);
                    pyramid.calculate();
                    break;
                case 7:
                    // Exit the program
                    System.out.println("Program Exited!");
                    System.exit(0);
                    break;
                default:
                    // Handle invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
