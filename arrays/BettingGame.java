package arrays;

import java.util.Scanner;

public class BettingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string containing only 'W' and 'L' (without space): ");
        String gameString = scanner.next();

        scanner.close();
    }   
}
