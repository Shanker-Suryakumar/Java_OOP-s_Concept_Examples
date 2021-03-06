package Classes;

/*
 * Reference URL for all these examples below :
 * https://www.freecodecamp.org/news/java-object-oriented-programming-system-principles-oops-concepts-for-beginners/
 */

public class Main {
    public static void main(String[] args) {
        /*
         * Creating objects
         */
        Cat tom = new Cat();
        Cat jerry = new Cat();

        /*
         * Defining tom cat
         */
        tom.name = "Tom";
        tom.age = 4;
        tom.breed = "Russian Blue";
        tom.color = "brown";

        tom.sleep();

        /*
         * Defining jerry cat
         */
        jerry.name = "Jarry";
        jerry.age = 3;
        jerry.breed = "Maine Coon";
        jerry.color = "brown";

        jerry.play();
    }
}
