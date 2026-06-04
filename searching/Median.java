package searching;

import java.util.Scanner;

public class Median {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int n1 = scanner.nextInt();

        int[] arr1 = new int[n1];

        System.out.print("Enter " + n1 + " elements for the array in ascending order: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int n2 = scanner.nextInt();

        int[] arr2 = new int[n2];

        scanner.close();
    }
}
