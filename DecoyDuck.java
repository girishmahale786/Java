// Concrete class representing a Decoy Duck
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        // Setting specific behaviors for Decoy Duck
        setQuackBehaviour(new MuteQuack());
        setFlyBehaviour(new FlyNoWay());
        setSwimBehaviour(new Drown());
    }

    // Implementation of the abstract display method
    void display() {
        System.out.println("This is Decoy Duck");
    }
}
