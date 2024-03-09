public class Rectangle extends Shape {
    // Private instance variables to store the length and width
    private double length;
    private double width;

    // Constructor to initialize the length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Function to calculate the area
    public double calculateShape() {
        return length * width;
    }

    // Function to calculate the perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Function to display the area and perimeter
    public void calculate() {
        showShape("Rectangle");
        System.out.println("Area: " + calculateShape());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
