package Vehicle_Example;

public class Auto extends VehicleFactory {
    @Override
    public void wheel() {
        System.out.println("I have 3 wheels.");
    }

    @Override
    public void fuel() {
        System.out.println("I use gas as fuel.");
    }

    @Override
    public void engine_cc() {
        System.out.println("I have 600CC engine.");
    }
}
