package defaultmethods;

public class DashboardDemo {
    public static void main(String[] args) {
        SmartVehicleDashboard ev = new ElectricCar();
        SmartVehicleDashboard ice = new PetrolCar();
        ev.displaySpeed(80); ev.displayBattery(72);
        ice.displaySpeed(70); ice.displayBattery(0);
    }
}
