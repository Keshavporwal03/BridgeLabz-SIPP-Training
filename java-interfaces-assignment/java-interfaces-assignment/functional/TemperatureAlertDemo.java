package functional;

import java.util.function.Predicate;

public class TemperatureAlertDemo {
    public static void main(String[] args) {
        double threshold = 37.5;
        Predicate<Double> fever = t -> t != null && t > threshold;
        double[] readings = {36.8, 37.6, 39.0, 37.4};
        for (double r : readings) {
            if (fever.test(r)) System.out.println("ALERT: Temperature " + r + "°C crossed threshold!");
            else System.out.println("OK: " + r + "°C");
        }
    }
}
