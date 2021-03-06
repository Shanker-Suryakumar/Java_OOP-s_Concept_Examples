package Interface;

/*
* An interface is a blueprint of a class.
* An interface is 100% abstract. No constructors are allowed here. 
* It represents an IS-A relationship.
* NOTE: Interfaces only define required methods. We can not retain common code.
* 
* By default, interface variables are public, static and final.
*/

interface Runnable {
    int a = 10; // similar to: public static final int a = 10;
    void run(); // similar to: public abstract void run();
}

public class InterfaceChecker implements Runnable {
    public static void main(String[] args) {
        Runnable.a = 5; // The final field Runnable.a cannot be assigned.
    }
}
