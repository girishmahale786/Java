// Class representing a Caller which implements the Runnable interface
public class Caller implements Runnable {
    Thread t;       // Thread instance associated with this Caller
    String msg;     // Message to be passed to the CallMe object
    CallMe target;  // Reference to the CallMe object to be called

    // Constructor to initialize the Caller with a target CallMe object and a message
    public Caller(CallMe terget, String msg) {
        this.target = terget;
        this.msg = msg;
        t = new Thread(this); // Creating a new Thread for this Caller (Runnable)
    }

    // Run method implementation required by Runnable interface
    @Override
    public void run() {
        // Synchronizing on the target object to ensure thread safety
        synchronized (target) {
            // Calling the 'call' method of the target CallMe object
            target.call(msg);
        }
    }
}
