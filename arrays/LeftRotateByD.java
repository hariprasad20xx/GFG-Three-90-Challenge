package arrays;

import java.util.Scanner;

public class LeftRotateByD {
    // Program to rotate an array by D places
    static void leftRotate(int[] arr, int n, int d) {

    }

    static void reverse(int[] arr, int low, int high) {
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();
    }
}
