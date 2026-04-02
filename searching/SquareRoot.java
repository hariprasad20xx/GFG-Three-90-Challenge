package searching;

import java.util.Scanner;

public class SquareRoot {
    // Program to find square of a given number

    static int floorSqrt(int n) {
        if (n == 0 || n == 1)
			return n;

        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        scanner.close();
    }
}
