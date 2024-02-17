import java.util.Scanner;

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

    // Method to get a float input from the user with a prompt message
    public float getFloatInput(String message) {
        System.out.print(message);
        return getScanner().nextFloat();
    }

    // Method to get a string input from the user with a prompt message
    public String getStringInput(String message) {
        System.out.print(message);
        return getScanner().nextLine();
    }

	// Method to get a Student object from the user
	public Student getStudentInput() {
		String studentString = getScanner().nextLine();
		String[] details = studentString.split(" ");
		Student student = new Student(Integer.parseInt(details[0]), details[1], details[2], Float.parseFloat(details[3]));
		return student;
	}

}
