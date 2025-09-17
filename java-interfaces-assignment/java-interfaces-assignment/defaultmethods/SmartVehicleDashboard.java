package defaultmethods;

public interface SmartVehicleDashboard {
    void displaySpeed(int kmph);
    default void displayBattery(int percent) {
        System.out.println("Battery: N/A (not an EV)");
    }
}
