package searching;

import java.util.Scanner;

public class SquareRoot {
    // Program to find square of a given number

    static int floorSqrt(int n) {
        if (n == 0 || n == 1)
			return n;

        int i = 1, result = 1;

		while (result <= n) {
			i++;
			result = i * i;
		}
		return i - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        System.out.println("Square root of " + n + ": " + floorSqrt(n));

        scanner.close();
    }
}
