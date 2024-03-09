public class Sphere extends Shape implements Volume {
    // Private instance variable to store the radius
    private double radius;

    // Constructor to initialize the radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Function to calculate the area
    public double calculateShape() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Perimeter calculation for a 3D shape is not applicable
    public double calculatePerimeter() {
        return 0.0;
    }

    // Function to calculate the volume
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Function to display the area and volume
    public void calculate() {
        showShape("Sphere");
        System.out.println("Area: " + calculateShape());
        System.out.println("Volume: " + calculateVolume());
    }
}
