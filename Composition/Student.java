package Composition;

/*
 * Student can exist without StudentId but 
 * StudentId cannot exist without Student. 
 * This type of relationship is known as composition.
 */

class StudentId {
    private String idNumber; // A-123456789
    private String bloodGroup;
    private String accountNumber;
}

public class Student {
    private String name;
    private int age;
    private int grade;
    private StudentId studentId; // Student HAS-A StudentId

    public void study() {
        System.out.println("Study");
    }
}
