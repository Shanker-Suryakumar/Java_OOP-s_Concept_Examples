package Polymorphism;

/*
 * NOTE: Static methods can also be overloaded.
 */

class Addition {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class StaticMethodOverloader {
    public static void main(String[] args) {
        System.out.println("Sum of 2 numbers is : " + Addition.add(5, 5));
        System.out.println("Sum of 3 numbers is : " + Addition.add(1, 3, 7));
    }
}
