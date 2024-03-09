import java.util.Scanner;

// Class to handle user input
public class UserInput {

    // Scanner object to get the input
    private Scanner scanner = new Scanner(System.in);

    // Method to get a integer input from the user with a prompt message
    public int getIntInput(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    // Method to get a double input from the user with a prompt message
    public double getDoubleInput(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

}
