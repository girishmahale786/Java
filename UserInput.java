import java.util.Scanner;

// Class to handle user input
public class UserInput {

    // Method to get the Scanner object for reading input
    public Scanner getScanner() {
        return new Scanner(System.in);
    }

    // Method to get a integer input from the user with a prompt message
    public int getIntInput(String message) {
        System.out.println(message);
        return getScanner().nextInt();
    }

    // Method to get a double input from the user with a prompt message
    public double getDoubleInput(String message) {
        System.out.println(message);
        return getScanner().nextDouble();
    }

    // Method to get a string input from the user with a prompt message
    public String getStringInput(String message) {
        System.out.println(message);
        return getScanner().nextLine();
    }

    // Method to get an array input from the user with a prompt message
    public double[] getArrayInput() {
        Scanner scanner = getScanner();

        // Prompt user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array to store the input elements
        double[] array = new double[size];

        // Prompt user to enter each element of the array
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }

}
