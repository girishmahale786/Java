// Implementation of FlyBehaviour for ducks that can't fly
public class FlyNoWay implements FlyBehaviour {
    public void fly() {
        // Displaying a message indicating inability to fly
        System.out.println("Can't Fly!");
    }
}
