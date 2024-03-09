// Implementation of SwimBehaviour for ducks that can't swim
public class Drown implements SwimBehaviour {
    public void swim() {
        // Displaying a message indicating inability to swim
        System.out.println("Can't Swim!");
    }
}
