package recursion;

import java.util.Scanner;

public class CountDigits {

    static int countDigits(int n) {
        // handle negative numbers
        if (n < 0) {
            return countDigits(-n);
        }
        
        //base case
        if (n < 10) {
            return 1;
        }

        // recursive case
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int digits = countDigits(n);

        scanner.close();
    }
}
