package recursion;

import java.util.Scanner;

public class Fibonacci {
    // Program to find Nth fibonacci number

    static int fibonacci(int n) {
        return (n <= 1) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the fibonacci term number: ");
        int n = scanner.nextInt();

        scanner.close();
    }
}
