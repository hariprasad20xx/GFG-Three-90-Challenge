package arrays;

import java.util.Scanner;

public class RemoveDuplicates {
    // Program to remove duplicates in a sorted array

    static void removeDuplicates(int[] arr, int n) {

    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements for the array in sorted order: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();
    }
}
