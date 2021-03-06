package Abstraction;

/*
 * Technically abstract means something incomplete or to be completed later.
 * In Java, we can achieve abstraction in two ways: abstract class (0 to 100%) and interface (100%).
 * The keyword abstract can be applied to classes and methods. abstract and final or static can never be together.
 * 
 * Abstraction is a process of hiding the implementation details and showing only functionality to the user. 
 */

abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Circle!");
    }

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
    }
}
