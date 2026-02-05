package recursion;

import java.util.Scanner;

public class PrintOneToN {
    // Program to print 1 to N using recursion
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }

        // recursive function call
        printNumbers(n - 1);

        System.out.println(n);
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        printNumbers(n);

        scanner.close();
    }
}