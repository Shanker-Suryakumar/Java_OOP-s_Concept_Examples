package Inheritance;

/*
 * Let’s say that the album shop we discussed also sells Blu-ray movies.
 * There are many common states and behaviors (common code) between Album and Movie.
 * This is where we use inheritance.
 * Inheritance is a mechanism in which one object acquires all the states and behaviors of a parent object.
 * Inheritance uses a parent-child relationship (IS-A relationship).
 * 
 * A class can extend only one class however it can implement any number of interfaces. 
 * An interface can extend more than one interfaces.
 */

public class StockKeeper {
    private String name;

    public StockKeeper(String name) {
        this.name = name;
    }

    public void manageMovie(Movie movie, String name, String director, double price, int numberOfCopies) {
        /*
         * Defining states and behaviours of album
         */
        movie.setName(name);
        movie.setDirector(director);
        movie.setPrice(price);
        movie.setNumberOfCopies(numberOfCopies);

        /*
         * Printing movie details
         */
        System.out.println("Movie managed by : " + getName());
        System.out.println("Movie details::::::::::");
        System.out.println("Movie name : " + movie.getName());
        System.out.println("Movie director : " + movie.getDirector());
        System.out.println("Movie price : " + movie.getPrice());
        System.out.println("Movie number of copies : " + movie.getNumberOfCopies());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
