package searching;

import java.util.Scanner;

public class RecursiveBinarySearch {
    // Program to find element in an array using binary search

    static int binarySearch(int[] arr, int l, int r, int k) {

        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == k) 
                return mid;

            if (arr[mid] > k) 
                return binarySearch(arr, l, mid - 1, k);

            return binarySearch(arr, mid + 1, r, k);
        }
        return -1;
    }
    
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
