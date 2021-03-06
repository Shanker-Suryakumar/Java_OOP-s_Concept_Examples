package Vehicle_Example;

public class VehicleBase {
    public iVehicle getCar() {
        iVehicle iCar = new Car();
        return iCar;
    }

    public iVehicle getAuto() {
        iVehicle iAuto = new Auto();
        return iAuto;
    }

    public iVehicle getBike() {
        iVehicle iBike = new Bike();
        return iBike;
    }
}
