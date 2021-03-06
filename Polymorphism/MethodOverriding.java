package Polymorphism;

/*
 * If a subclass has the same method as declared in the super class, 
 * this is known as method overriding.
 * 
 * Method overriding rules:
 * 1. Must have the same parameter list. 
 * 2. Must have the same return type: although a covariant return allows us to change the return type of the overridden method. 
 * 3. Must not have a more restrictive access modifier: may have a less restrictive access modifier. 
 * 4. Must not throw new or broader checked exceptions: may throw narrower checked exceptions and may throw any unchecked exception. 
 * 5. Only inherited methods may be overridden (must have IS-A relationship).
 * 
 * NOTE: Static methods can’t be overridden because methods are overridden at run time. 
 * Static methods are associated with classes while instance methods are associated with objects. 
 * So in Java, the main() method also can’t be overridden.
 * 
 * NOTE: Constructors can be overloaded but not overridden.
 */

class Programmers {
    public void code() {
        System.out.println("Coding in C++");
    }
}

class JavaProgrammers extends Programmers {
    public void code() {
        System.out.println("Coding in Java");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Programmers ben = new JavaProgrammers();
        ben.code();
    }
}
