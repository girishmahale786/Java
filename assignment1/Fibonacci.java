/**
* @author  Girish Mahale
* @branch  AIML B3
* @batch   2022-26
* @prn     23070126504
*/


import java.util.Scanner;

// Class to calculate and print Fibonacci numbers
public class Fibonacci {

	// Main method to initiate program execution
	public static void main(String args[]) {
		// Create a Scanner object to take user input
		Scanner scan = new Scanner(System.in);

		// Prompt the user to enter the number of Fibonacci terms to generate
		System.out.print("Enter the number of Fibonacci numbers to generate: ");
		int n = scan.nextInt();

		// Print the first n Fibonacci numbers
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}

		// Close the Scanner resource
		scan.close();
	}

	// Recursive method to calculate the nth Fibonacci number
	public static int fibonacci(int n) {
		// Base cases: 0th and 1st Fibonacci numbers are 0 and 1, respectively
		if (n <= 1) {
			return n;
		} else {
			// Recursively calculate Fibonacci numbers
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
