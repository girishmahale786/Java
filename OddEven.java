/**
* @author  Girish Mahale
* @branch  AIML B3
* @batch   2022-26
* @prn     23070126504
*/

import java.io.IOException;

public class OddEven {

    // Method to convert an array to a string representation
	public static String arrayString(double[] array, int size) {
		String output = "[";
		for (int i = 0; i < size; i++) {
			output += array[i];
			if (i != size - 1) {
				output += ", ";
			}
		}
		output += "]";
		return output;
	}

	public static void main(String[] args) throws IOException {
		// Creating an instance of the UserInput class for handling user input
        UserInput userInput = new UserInput();

        // Declare arrays for even and odd numbers
		double[] even;
		double[] odd;
		int indexEven = 0;
		int indexOdd = 0;

        // Read the size of the array from user input
        int size = userInput.getIntInput("Enter the number of elements: ");

        // Initialize arrays for even and odd numbers based on the user-defined size
        even = new double[size];
        odd = new double[size];

        // Get the array input from the user using the UserInput class
        double[] array = userInput.getArrayInput(size);


        // Separate even and odd numbers into their respective arrays
        for (int i = 0; i < size; i++) {
			if (array[i] % 2 == 0) {
				even[indexEven] = array[i];
				indexEven++;
			} else {
				odd[indexOdd] = array[i];
				indexOdd++;
			}
		}

        // Print even numbers
        System.out.print("Even Numbers: ");
        System.out.println(arrayString(even, indexEven));

        // Print odd numbers
		System.out.print("Odd Numbers: ");
        System.out.println(arrayString(odd, indexOdd));

    }
}
