package Vehicle_Example;

public class Main {
    public void getAllVehicles() 
    {
        VehicleBase objVehicleBase = new VehicleBase();
        
        iVehicle iCar =  objVehicleBase.getCar();
        iCar.wheel();
        iCar.fuel();
        iCar.engine_cc();
        iCar.ride();

        iVehicle iBike =  objVehicleBase.getBike();
        iBike.wheel();
        iBike.fuel();
        iBike.engine_cc();
        iBike.ride();

        iVehicle iAuto =  objVehicleBase.getAuto();
        iAuto.wheel();
        iAuto.fuel();
        iAuto.engine_cc();
        iAuto.ride();
    }
   
    public static void main(String[] args) {
        Main main = new Main();
        main.getAllVehicles();
    }
}
