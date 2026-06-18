import java.util.Scanner;
 
public class TemperatureConverter {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
 
        System.out.println("===== Temperature Converter =====");
 
        while (running) {
            System.out.println("\nConversion options:");
            System.out.println("  1. Celsius    → Fahrenheit");
            System.out.println("  2. Celsius    → Kelvin");
            System.out.println("  3. Fahrenheit → Celsius");
            System.out.println("  4. Fahrenheit → Kelvin");
            System.out.println("  5. Kelvin     → Celsius");
            System.out.println("  6. Kelvin     → Fahrenheit");
            System.out.println("  0. Quit");
            System.out.print("\nChoose an option: ");
 
            int choice = scanner.nextInt();
 
            if (choice == 0) {
                System.out.println("Goodbye!");
                running = false;
                break;
            }
 
            System.out.print("Enter temperature value: ");
            double value = scanner.nextDouble();
            double result;
 
            switch (choice) {
                case 1:
                    result = celsiusToFahrenheit(value);
                    System.out.printf("%.2f °C  =  %.2f °F%n", value, result);
                    break;
                case 2:
                    result = celsiusToKelvin(value);
                    System.out.printf("%.2f °C  =  %.2f K%n", value, result);
                    break;
                case 3:
                    result = fahrenheitToCelsius(value);
                    System.out.printf("%.2f °F  =  %.2f °C%n", value, result);
                    break;
                case 4:
                    result = fahrenheitToKelvin(value);
                    System.out.printf("%.2f °F  =  %.2f K%n", value, result);
                    break;
                case 5:
                    result = kelvinToCelsius(value);
                    System.out.printf("%.2f K  =  %.2f °C%n", value, result);
                    break;
                case 6:
                    result = kelvinToFahrenheit(value);
                    System.out.printf("%.2f K  =  %.2f °F%n", value, result);
                    break;
                default:
                    System.out.println("Invalid option. Please choose 0–6.");
            }
        }
 
        scanner.close();
    }
 
    // ── Conversion Functions ──────────────────────────────────────────
 
    public static double celsiusToFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32;
    }
 
    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }
 
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5.0 / 9.0;
    }
 
    public static double fahrenheitToKelvin(double f) {
        return fahrenheitToCelsius(f) + 273.15;
    }
 
    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }
 
    public static double kelvinToFahrenheit(double k) {
        return celsiusToFahrenheit(kelvinToCelsius(k));
    }
}
