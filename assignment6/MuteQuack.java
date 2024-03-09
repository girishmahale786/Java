// Implementation of QuackBehaviour for ducks that can't quack
public class MuteQuack implements QuackBehaviour {
    public void quack() {
        // Displaying a message indicating inability to quack
        System.out.println("Can't Quack!");
    }
}
