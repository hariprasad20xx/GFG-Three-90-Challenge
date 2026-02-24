package searching;

import java.util.Scanner;

public class RecursiveBinarySearch {
    // Program to find element in an array using binary search

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements for the array in sorted order: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the key: ");
        int key = scanner.nextInt();
        
        scanner.close();
    }
}
