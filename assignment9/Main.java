/**
* @author  Girish Mahale
* @branch  AIML B3
* @batch   2022-26
* @prn     23070126504
*/

// Main class to demonstrate synchronization
public class Main {

    // Main method to initiate program execution
    public static void main(String[] args) {
        // Creating a shared object of CallMe
        CallMe target = new CallMe();

        // Creating three instances of Caller, each targeting the same CallMe object
        Caller object1 = new Caller(target, "Hello");
        Caller object2 = new Caller(target, "Synchronised");
        Caller object3 = new Caller(target, "World");

        // Starting the threads for each Caller
        object1.t.start();
        object2.t.start();
        object3.t.start();

        try {
            // Waiting for all threads to complete execution
            object1.t.join();
            object2.t.join();
            object3.t.join();
        } catch (Exception e) {
            // Handling any exceptions that might occur during thread execution
            e.printStackTrace();
        }
    }
}
