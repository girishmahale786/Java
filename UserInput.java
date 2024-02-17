import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

// Class to handle user input
public class UserInput {

    // Method to get a integer input from the user with a prompt message
	public int getIntInput(String message) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(message);
		return Integer.parseInt(br.readLine());
    }


    // Method to get an array input from the user with a specified size
	public double[] getArrayInput(int size) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.printf("Enter %d numbers separated by spaces: ", size);
		String arrayString = br.readLine();
		String[] input = arrayString.trim().split("\\s+");

		double[] array = new double[size];
		for (int i = 0; i < size; i++) {
			array[i] = Double.parseDouble(input[i]);
		}
		return array;
	}
}
