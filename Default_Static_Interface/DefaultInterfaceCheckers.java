package Default_Static_Interface;

/*
 * Usually we implement interface methods in a separate class. 
 * Let’s say we are required to add a new method in an interface. 
 * Then we must implement that method in that separate class, too.
 * 
 * To overcome this issue Java 8 introduced default and static methods 
 * that implement methods inside an interface, unlike abstract methods. 
 */

interface DefaultInterface {
    void sleep();

    default void run() {
        System.out.println("I'm running!");
    }
}

public class DefaultInterfaceCheckers implements DefaultInterface {
    public void sleep() {
        System.out.println("Sleeping...");
    }

    public static void main(String[] args) {
        DefaultInterfaceCheckers checker = new DefaultInterfaceCheckers();
        checker.run();
        checker.sleep();
    }
}
