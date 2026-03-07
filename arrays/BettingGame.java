package arrays;

import java.util.Scanner;

public class BettingGame {

    static int betBalance(String s) {
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string containing only 'W' and 'L' (without space): ");
        String gameString = scanner.next();

        int result = betBalance(gameString);
        scanner.close();
    }   
}
