public class Cylinder extends Shape implements Volume {
    // Private instance variables to store the radius and height
    private double radius;
    private double height;

    // Constructor to initialize the radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Function to calculate the area
    public double calculateShape() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Perimeter calculation for a 3D shape is not applicable
    public double calculatePerimeter() {
        return 0.0;
    }

    // Function to calculate the volume
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Function to display the area and volume
    public void calculate(){
        showShape("Cylinder");
        System.out.println("Area: " + calculateShape());
        System.out.println("Volume: " + calculateVolume());
    }
}
