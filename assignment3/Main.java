/**
* @author  Girish Mahale
* @branch  AIML B3
* @batch   2022-26
* @prn     23070126504
*/

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the UserInput class for handling user input
        UserInput userInput = new UserInput();

        // Create an instance of Student to perform CRUD operations
        Student student = new Student();

        // Display menu and handle user input in a loop
        while (true) {
            // Display menu options
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            // Read user choice
            int choice = userInput.getIntInput("Enter your choice: ");

            // Process user choice using switch statement
            switch (choice) {
                case 1:
                    // Add a new student
                    int studentsCount = userInput.getIntInput("Enter number of students: ");
                    student.add(studentsCount);
                    System.out.println("Students added");
                    break;
                case 2:
                    // Display all student details
                    student.display();
                    break;
                case 3:
                    // Search for a student
                    int prnSearch = userInput.getIntInput("Enter PRN to search: ");
                    int index = student.search(prnSearch);
                    if (index != -1) {
                        System.out.println("Student found at index " + index);
                    }
                    else {
                        System.out.println("Student with PRN " + prnSearch + " not found.");
                    }
                    break;
                case 4:
                    // Update student details
                    int prnUpdate = userInput.getIntInput("Enter PRN to update details: ");
                    student.update(prnUpdate);
                    break;
                case 5:
                    // Delete a student
                    int prnDelete = userInput.getIntInput("Enter PRN to delete: ");
                    student.delete(prnDelete);
                    break;
                case 6:
                    // Exit the program
                    System.out.println("Program Exited!");
                    System.exit(0);
                default:
                    // Handle invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
