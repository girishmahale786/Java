// Abstract class representing a generic Duck
abstract public class Duck {
    // Composition: Duck has a FlyBehaviour
    private FlyBehaviour flyBehaviour;

    // Composition: Duck has a QuackBehaviour
    private QuackBehaviour quackBehaviour;

    // Composition: Duck has a SwimBehaviour
    private SwimBehaviour swimBehaviour;

    // Setter method for setting the fly behavior dynamically
    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    // Setter method for setting the quack behavior dynamically
    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

    // Setter method for setting the swim behavior dynamically
    public void setSwimBehaviour(SwimBehaviour sb) {
        swimBehaviour = sb;
    }

    // Abstract method for displaying specific details of a duck
    abstract void display();

    // Method for performing the fly behavior
    public void performFly() {
        flyBehaviour.fly();
    }

    // Method for performing the quack behavior
    public void performQuack() {
        quackBehaviour.quack();
    }

    // Method for performing the swim behavior
    public void performSwim() {
        swimBehaviour.swim();
    }
}
