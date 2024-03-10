import java.util.Arrays;

// Class to perform arithmetic and statistical operations
public class Calculator {

    // Method to add two numbers
    public double add(double n1, double n2){
        return n1 + n2;
    }

    // Method to subtract two numbers
    public double subtract(double n1, double n2){
        return n1 - n2;
    }

    // Method to multiply two numbers
    public double multiply(double n1, double n2){
        return n1 * n2;
    }

    // Method to divide two numbers
    public double divide(double n1, double n2) {
        return n1 / n2;
    }

    // Method to calculate the square root of a number
    public double sqrt(double n){
        return Math.pow(n, 0.5);
    }

    // Method to calculate the power of a number
    public double power(double n1, double n2){
        return Math.pow(n1, n2);
    }

    // Method to calculate the mean (average) of an array of numbers
    public double mean(double[] arr) {
        return Arrays.stream(arr).sum() / arr.length;
    }

    // Method to calculate the variance of an array of numbers
    public double variance(double[] arr){
        // Variance is the square root of the standard deviation
        return this.sqrt(stddev(arr));
    }

    // Method to calculate the standard deviation of an array of numbers
    public double stddev(double[] arr){
        double stdDev = 0.0;

        // Calculate the sum of squared differences from the mean
        for (double num : arr) {
            stdDev += this.power(num - this.mean(arr), 2);
        }

        // Calculate the square root of the average of squared differences
        return this.sqrt(stdDev / arr.length);
    }

}
