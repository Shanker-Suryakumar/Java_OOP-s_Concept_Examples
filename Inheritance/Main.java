package Inheritance;

public class Main {
    public static void main(String[] args) {
        StockKeeper johnDoe = new StockKeeper("John Doe");
        /*
         * Stock keeper creates movie and assigns values for price and number
         * of copies available
         */
        johnDoe.manageMovie(new Movie(), "Drishyam 2", "Jithu Joseph", 1000.00, 50);
    }
}
