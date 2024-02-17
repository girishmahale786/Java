import java.util.Scanner;
import java.util.*;

// Class to handle user input
public class UserInput {

    // Method to get the Scanner object for reading input
    public Scanner getScanner() {
        return new Scanner(System.in);
    }

    // Method to get a integer input from the user with a prompt message
    public int getIntInput(String message) {
        System.out.print(message);
        return getScanner().nextInt();
    }

    // Method to get a string input from the user with a prompt message
    public String getStringInput(String message) {
        System.out.print(message);
        return getScanner().nextLine();
    }

	// Method to get choice input from the user
    public String getChoiceInput(String[] choices, String choice) {
        String choiceString = String.format("[%s]", String.join(", ", choices));
        List<String> choiceList = Arrays.asList(choices);
        System.out.printf("Select %s from %s: ", choice, choiceString);
        while(true) {
            String input = getScanner().nextLine();
            if (choiceList.contains(input)) {
                return input;
            }
            System.out.printf("Invalid %s. Select %s from %s: ", choice, choice, choiceString);
        }
    }
}
