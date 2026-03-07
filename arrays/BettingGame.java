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
            } else if (s.charAt(i) == 'L'){
                balance -= betAmount;
                betAmount *= 2;
            } else {
                System.out.println("Invalid input! Please enter a string containing only 'W' and 'L'.");
                return 0;
            }
        }

        return balance;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string containing only 'W' and 'L' (without space): ");
        String gameString = scanner.next();

        int result = betBalance(gameString);

        if (result == 0) {
            scanner.close();
            return;
        } else if (result == -1){
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Bet balance: " + result);
        }

        scanner.close();
    }   
}
