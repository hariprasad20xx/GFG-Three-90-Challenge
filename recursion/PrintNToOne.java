package recursion;

import java.util.Scanner;

public class PrintNToOne {
    // Program to print N to one using recursion
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);

        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        
        scanner.close();
    }
}
