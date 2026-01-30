import java.util.Scanner;

public class Factorial {
    // Program to find a factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int fact = 1;
        // calculate factorial
        for (int i = 2; i <= n; i++) {
            fact *= i; 
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        System.out.println("Factorial of " + n + " is: " + factorial(n));

        scanner.close();
    }
}
