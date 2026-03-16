package arrays;

import java.util.Scanner;

public class LeftRotateByD {
    // Program to rotate an array by D places
    static void leftRotate(int[] arr, int n, int d) {
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
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

        System.out.print("Enter the number of left rotations (D): "   );
        int d = scanner.nextInt();

        leftRotate(arr, n, d);

        System.out.print("Array after " + d + " left rotations: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }      

        System.out.println();
        
        scanner.close();
    }
}
