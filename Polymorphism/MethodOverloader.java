package Polymorphism;

/*
 * If a class has multiple methods that have same name but different parameters, 
 * this is known as method overloading.
 * 
 * Method overloading rules:
 * 1. Must have a different parameter list.
 * 2. May have different return types.
 * 3. May have different access modifiers.
 * 4. May throw different exceptions.
 */

class JavaProgrammer {
    public void code() {
        System.out.println("Coding in C++");
    }

    public void code(String language) {
        System.out.println("Coding in " + language);
    }
}

public class MethodOverloader {
    public static void main(String[] args) {
        JavaProgrammer gosling = new JavaProgrammer();
        gosling.code();
        gosling.code("Java");
    }
}
