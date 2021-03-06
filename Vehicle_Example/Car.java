package Vehicle_Example;

public class Car extends VehicleFactory {
    @Override
    public void wheel() {
        System.out.println("I have 4 wheels.");
    }

    @Override
    public void fuel() {
        System.out.println("I use diesel as fuel.");
    }

    @Override
    public void engine_cc() {
        System.out.println("I have 1200CC engine.");
    }
}
