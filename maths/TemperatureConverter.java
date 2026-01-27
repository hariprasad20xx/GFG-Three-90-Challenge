import java.util.Scanner;

public class TemperatureConverter {
    // Program to convert temperature
    
    public static double cToF(double C) {
        return C * 1.8 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in celsius: ");
        double temperature = scanner.nextDouble();

        double result = cToF(temperature);
        scanner.close();
    }
}
