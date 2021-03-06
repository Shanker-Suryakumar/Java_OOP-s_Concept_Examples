package Inheritance;

public class Movie {
    private String name;
    private String director;
    private double price;
    private int numberOfCopies;

    public void sellCopies() {
        if (numberOfCopies > 0) {
            numberOfCopies--;
            System.out.println("One album has sold!");
        } else {
            System.out.println("No more albums available!");
        }
    }

    public void orderCopies(int num) {
        numberOfCopies += num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
}
