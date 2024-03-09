/**
* @author  Girish Mahale
* @branch  AIML B3
* @batch   2022-26
* @prn     23070126504
*/

public class Main {
    public static void main(String[] args) {
        // Creating and testing a Mallard Duck
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.performSwim();
        System.out.println("-".repeat(20));

        // Creating and testing a RedHead Duck
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.performSwim();
        System.out.println("-".repeat(20));

        // Creating and testing a Rubber Duck
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performSwim();
        System.out.println("-".repeat(20));

        // Creating and testing a Decoy Duck
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.performSwim();
        System.out.println("-".repeat(20));
    }
}
