/**
* @author  Girish Mahale
* @branch  AIML B3
* @batch   2022-26
* @prn     23070126504
*/

import java.io.IOException;
import java.util.*;

public class ArrayListArray {
    // Method to convert an array to ArrayList
    public static ArrayList<Double> arrayToArrayList(double[] array) {
        ArrayList<Double> arrayList = new ArrayList<>();
        for (double value : array) {
            arrayList.add(value);
        }
        return arrayList;
    }

    // Method to convert an ArrayList to array
    public static double[] arrayListToArray(ArrayList<Double> arrayList) {
        double[] array = new double[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        // Creating an instance of the UserInput class for handling user input
        UserInput userInput = new UserInput();

        // Read the size of the array from user input
        int size = userInput.getIntInput("Enter the number of elements: ");

        // Get the array input from the user using the UserInput class
        double[] array = userInput.getArrayInput(size);

        // Print the primitive double array using Arrays.toString
        System.out.print("Primitive array: ");
        System.out.println(Arrays.toString(array));

        // Convert the primitive double array to an ArrayList<Double>
        ArrayList<Double> arrayList = arrayToArrayList(array);

        // Print the elements of the ArrayList using a for-each loop
        System.out.println("Primitive array to ArrayList: ");
        for (Double element : arrayList) {
            System.out.println(element);
        }

        // Convert ArrayList to array
        System.out.print("ArrayList to array: ");
        array = arrayListToArray(arrayList);
        System.out.println(Arrays.toString(array));
    }
}
