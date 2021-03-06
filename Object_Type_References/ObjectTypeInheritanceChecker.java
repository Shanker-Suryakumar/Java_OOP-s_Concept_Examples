package Object_Type_References;

/**
 * 
 */

class Person {
    void eat() {
        System.out.println("Person is eating");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student is studying");
    }
}

public class ObjectTypeInheritanceChecker {
    public static void main(String[] args) {
        Person alex = new Person();// New Person "is a" Person
        alex.eat();
        Student jane = new Student();// New Student "is a" Student
        jane.eat();
        jane.study();
        Person mary = new Student();// New Student "is a" Person
        mary.eat();
        // Student chris = new Person(); //New Person isn't a Student.
    }
}
