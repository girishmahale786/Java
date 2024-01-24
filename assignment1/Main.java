/**
* @author  Girish Mahale
* @branch  AIML B3
* @batch   2022-26
* @prn     23070126504
*/


public class Main {

    // Main method to initiate program execution
    public static void main(String[] args) {

        // Create an instance of UserInput to handle user input
        UserInput userInput = new UserInput();

        // Create an instance of Calculator to perform arithmetic and statistical operations
        Calculator calculator = new Calculator();

        // Get the user's choice of operation
        int choice = userInput.getIntInput("Choose Operation - 1 for arithmetic, 2 for statistical: ");
        // int choice = userInput.getIntInput("Enter Your Choice: (+, -, *, /, ^, var, stddev, avg)");

        // Check if the chosen operation is an arithmetic operation
        switch (choice) {
            case 1:
                // Get user input for two numbers
                double n1 = userInput.getDoubleInput("Enter First Number:");
                double n2 = userInput.getDoubleInput("Enter Second Number:");

                // Get the user's choice of arithmetic operation
                String operation = userInput.getStringInput("Choose Operation (+, -, *, /, ^): ");

                // Variable to store the result of the operation, initially set to NaN
                double result = Double.NaN;

                switch (operation) {
                    case "+":
                        // Perform addition operation
                        result = calculator.add(n1, n2);
                        break;

                    case "-":
                        // Perform subtraction operation
                        result = calculator.subtract(n1, n2);
                        break;

                    case "*":
                        // Perform multiplication operation
                        result = calculator.multiply(n1, n2);
                        break;

                    case "/":
                        // Perform division operation
                        result = calculator.divide(n1, n2);
                        break;

                    case "^":
                        // Perform power operation
                        result = calculator.power(n1, n2);
                        break;

                    default:
                        // Display error message if an invalid operation is chosen
                        System.err.println("Invalid Arithmetic Operation");
                        break;
                }

                // If the result is not NaN, display the result
                if (!Double.isNaN(result)) {
                    String resultString = String.format("%.2f %s %.2f = %.2f", n1, operation, n2, result);
                    System.out.println(resultString);
                }

                break;

            case 2:
                // Get user input for an array of numbers
                double[] array = userInput.getArrayInput();

                // Get the user's choice of statistical operation
                int statChoice = userInput.getIntInput("Choose Statistical Operation (1 for mean, 2 for variance, 3 for standard deviation): ");

                // Variable to store the result of the operation, initially set to NaN
                double statResult = Double.NaN;

                switch (statChoice) {
                    case 1:
                        // Calculate mean
                        statResult = calculator.mean(array);
                        break;

                    case 2:
                        // Calculate variance
                        statResult = calculator.variance(array);
                        break;

                    case 3:
                        // Calculate standard deviation
                        statResult = calculator.stddev(array);
                        break;

                    default:
                        System.err.println("Invalid Statistical Operation");
                        break;
                }

                // A string to represent the statistical operations
                String statOperation = null;
                if (statChoice == 1) {
                    statOperation = "mean";
                }
                else if (statChoice == 2) {
                    statOperation = "variance";
                }
                else if (statChoice == 3) {
                    statOperation = "standard deviation";
                }

                // If the result is not NaN, display the result
                if (!Double.isNaN(statResult)) {
                    System.out.print(String.format("The %s of the array: ", statOperation));
                    printArray(array);
                    System.out.println(String.format(" is %.2f", statResult));
                }

                break;

            default:
                System.err.println("Invalid Operation");
                break;
        }
    }

    // Method to print an array
    public static void printArray(double[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
    }

}
