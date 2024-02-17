/**
* @author  Girish Mahale
* @branch  AIML B3
* @batch   2022-26
* @prn     23070126504
*/

import java.io.IOException;

public class Neighbours {

    // Method to find the index of nearest neighbours in the array
    public static int findNearestNeighbours(double[] arr) {
        double minDistance = Double.MAX_VALUE;
        int index = -1;

        // Iterate through the array and calculate distances between adjacent elements
        for (int i = 0; i < arr.length - 1; i++) {
            double distance = Math.abs(arr[i] - arr[i + 1]);

            // Update the index if the current distance is smaller than the minimum distance
            if (distance < minDistance) {
                minDistance = distance;
                index = i;
            }
        }

        // Return the index of the nearest neighbours
        return index;
    }

    public static void main(String[] args) throws IOException {
        // Creating an instance of the UserInput class for handling user input
        UserInput userInput = new UserInput();

        // Read the size of the array from user input
        int size = userInput.getIntInput("Enter the number of elements: ");

        // Get the array input from the user using the UserInput class
        double[] array = userInput.getArrayInput(size);

        // Find and print the index of the nearest neighbours in the array
        System.out.println("Index of Nearest Neighbours: " + findNearestNeighbours(array));
    }
}
