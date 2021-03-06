package With_Encapsulation;

/*
 * This can be achieved by using private access modifiers that can’t be accessed by anything outside the class. 
 * In order to access private states safely, we have to provide public getter and setter methods.
 */

public class Album {
    private String name;
    private String artist;
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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    public int getNumberOfCopies() {
        return this.numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        if (numberOfCopies > 0) {
            this.numberOfCopies = numberOfCopies;
        } else {
            this.numberOfCopies = 0;
        }
    }
}
