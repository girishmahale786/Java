public class Circle extends Shape {
    // Private instance variable to store the radius
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Function to calculate the area
    public double calculateShape() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Function to calculate the perimeter
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Function to display the area and perimeter
    public void calculate() {
        showShape("Circle");
        System.out.println("Area: " + calculateShape());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
