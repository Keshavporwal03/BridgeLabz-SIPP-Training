package defaultmethods;

public class ElectricCar implements SmartVehicleDashboard {
    @Override public void displaySpeed(int kmph) { System.out.println("EV Speed: " + kmph + " km/h"); }
    @Override public void displayBattery(int percent) { System.out.println("EV Battery: " + percent + "%"); }
}
