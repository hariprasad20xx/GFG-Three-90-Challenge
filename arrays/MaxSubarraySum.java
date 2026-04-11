package arrays;

import java.util.Scanner;

public class MaxSubarraySum {

    static void subarrayMaxSum(int[] arr) {
        int endIndex = 0;
        int currentMax = arr[0];
        int globalMax = arr[0];
    }

    public static void main(String[] agrs) {
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
