package Casting;

/*
 * Java type casting is classified into two types:
 * 1. Widening casting (implicit): automatic type conversion.
 * 2. Narrowing casting (explicit): need explicit conversion.
 * 
 * NOTE : when creating an object using the new keyword: 
 * the reference type should be the same type or a super type of the object type.
 */

class A {
    public void display(){
        System.out.println("Class A");
    }
}

class B extends A{
    public void display(){
        System.out.println("Class B");
    }
}

public class CastingTest {
    public static void main(String[] args) {
        A objA = new B();
        if(objA instanceof B){
            ((B)objA).display();
        }
    }
}
