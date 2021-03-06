package Classes;

/*
 * Classes define states as instance variables and behaviors as instance methods.
 */

public class Cat {
    /*
     * Instance variables: states of Cat
     */
    String name;
    int age;
    String color;
    String breed;''

    /*
     * Instance methods: behaviours of Cat
     */
    void sleep() {
        System.out.println("Sleeping");
    }

    void play() {
        System.out.println("Playing");
    }

    void feed() {
        System.out.println("Feeding");
    }
}
