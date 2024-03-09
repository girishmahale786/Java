// Concrete class representing a Rubber Duck
public class RubberDuck extends Duck {
    public RubberDuck() {
        // Setting specific behaviors for Rubber Duck
        setQuackBehaviour(new Squeak());
        setFlyBehaviour(new FlyNoWay());
        setSwimBehaviour(new Float());
    }

    // Implementation of the abstract display method
    void display() {
        System.out.println("This is Rubber Duck");
    }
}
