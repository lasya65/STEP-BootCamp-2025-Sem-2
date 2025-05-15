import java.util.*;

class WindChillCalculator {
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
                + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double temp = sc.nextDouble();
        System.out.print("Enter wind speed in mph: ");
        double speed = sc.nextDouble();

        WindChillCalculator obj = new WindChillCalculator();
        double wct = obj.calculateWindChill(temp, speed);
        System.out.println("Wind Chill Temperature: " + wct);
    }
}