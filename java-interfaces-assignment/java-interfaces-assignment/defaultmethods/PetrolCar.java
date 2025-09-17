package defaultmethods;

public class PetrolCar implements SmartVehicleDashboard {
    @Override public void displaySpeed(int kmph) { System.out.println("ICE Speed: " + kmph + " km/h"); }
    // inherits default displayBattery()
}
