package recursion;

import java.util.Scanner;

public class CountDigits {

    static int countDigits(int n) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int digits = countDigits(n);

        scanner.close();
    }
}
