import java.util.Scanner;

public class DigitsInFactorial {
    // Program to find digits in a factorial
    public static int digitsInFactorial(int n) {
        int numOfDigits = 0;
        double logSum = 0;
        
        for (int i = 1; i <= n; i++) {
            logSum = logSum + (Math.log10(i));
        }
        
        numOfDigits = (int)Math.floor(logSum) + 1;

        return numOfDigits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        int digits = digitsInFactorial(n);
        
        scanner.close();
    }
}
