package Vehicle_Example;

public class Bike extends VehicleFactory {
    @Override
    public void wheel() {
        System.out.println("I have 2 wheels.");
    }

    @Override
    public void fuel() {
        System.out.println("I use petrol as fuel.");
    }

    @Override
    public void engine_cc() {
        System.out.println("I have 200CC engine.");
    }
}
