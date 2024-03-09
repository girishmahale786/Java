public abstract class Shape {
    // Non-abstract method to show the shape
    public void showShape(String shape) {
        System.out.println("Selected shape: " + shape);
    }

    // Abstract methods to be implemented by subclasses for area and perimeter
    public abstract double calculateShape();
    public abstract double calculatePerimeter();
}
