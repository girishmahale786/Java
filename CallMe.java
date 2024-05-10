// Class representing a method to be called by multiple threads
public class CallMe {
    // Method that prints a message enclosed in square brackets with a delay
    synchronized public void call(String msg) {
        // Print the beginning of the message in brackets
        System.out.print("[ " + msg);
        try {
            // Introduce a delay to simulate processing
            Thread.sleep(1000);
        } catch (Exception e) {
            // Handle any exceptions that might occur during sleep (unlikely here)
            e.printStackTrace();
        }
        // Print the closing bracket and newline
        System.out.println(" ]");
    }
}
