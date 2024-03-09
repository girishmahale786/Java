// Concrete class representing a Mallard Duck
public class MallardDuck extends Duck {
    public MallardDuck() {
        // Setting specific behaviors for Mallard Duck
        setQuackBehaviour(new Quack());
        setFlyBehaviour(new FlyWithWings());
        setSwimBehaviour(new Swim());
    }

    // Implementation of the abstract display method
    void display() {
        System.out.println("This is Mallard Duck");
    }
}
