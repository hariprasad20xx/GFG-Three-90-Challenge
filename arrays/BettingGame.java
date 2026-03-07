package arrays;

import java.util.Scanner;

public class BettingGame {

    static int betBalance(String s) {
        int balance = 4;
        int betAmount = 1;
        
        for (int i = 0; i < s.length(); i++) {
            
            if (balance < 0 || balance < betAmount) {
                return -1;
            }
            
            if (s.charAt(i) == 'W') {
                balance += betAmount;
                betAmount = 1;
            } else {
                balance -= betAmount;
                betAmount *= 2;
            } 
        }

        return balance;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string containing only 'W' and 'L' (without space): ");
        String gameString = scanner.next();

        int result = betBalance(gameString);
        scanner.close();
    }   
}
