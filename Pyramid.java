public class Pyramid extends Shape implements Volume {
    // Private instance variables to store the base length, base width, and height
    private double baseLength;
    private double baseWidth;
    private double height;

    // Constructor to initialize the base length, base width, and height
    public Pyramid(double baseLength, double baseWidth, double height) {
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    // Function to calculate the area
    public double calculateShape() {
        return baseLength * baseWidth + 0.5 * baseLength * Math.sqrt(Math.pow(baseWidth / 2, 2) + Math.pow(height, 2))
                + 0.5 * baseWidth * Math.sqrt(Math.pow(baseLength / 2, 2) + Math.pow(height, 2));
    }

    // Perimeter calculation for a 3D shape is not applicable
    public double calculatePerimeter() {
        return 0.0;
    }

    // Function to calculate the volume
    public double calculateVolume() {
        return (1.0 / 3.0) * baseLength * baseWidth * height;
    }

    // Function to display the area and volume
    public void calculate() {
        showShape("Pyramid");
        System.out.println("Area: " + calculateShape());
        System.out.println("Volume: " + calculateVolume());
    }
}
