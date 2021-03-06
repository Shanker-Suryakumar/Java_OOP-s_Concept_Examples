package Polymorphism;

/*
 * NOTE: We can overload the main() method 
 * but the Java Virtual Machine (JVM) calls the main() method 
 * that receives String arrays as arguments.
 */

public class PolyTest {
    public static void main() {
        System.out.println("Main method overloading with main()");
    }

    public static void main(String args) {
        System.out.println("Main method overloading with main(String args)");
    }

    public static void main(String[] args) {
        System.out.println("Main method overloading with main(String[] args)");
        PolyTest.main();
        PolyTest.main("Cool");
    }
}
