public class Square extends Shape {
    // Private insance variable to store the side
    private double side;

    // Constructor to initialize the side
    public Square(double side) {
        this.side = side;
    }

    // Function to calculate the area
    public double calculateShape() {
        return Math.pow(side, 2);
    }

    // Function to calculate the perimeter
    public double calculatePerimeter() {
        return 4 * side;
    }

    // Function to display the area and perimeter
    public void calculate() {
        showShape("Square");
        System.out.println("Area: " + calculateShape());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
