// Concrete class representing a RedHead Duck
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        // Setting specific behaviors for RedHead Duck
        setQuackBehaviour(new Quack());
        setFlyBehaviour(new FlyWithWings());
        setSwimBehaviour(new Swim());
    }

    // Implementation of the abstract display method
    void display() {
        System.out.println("This is RedHead Duck");
    }
}
