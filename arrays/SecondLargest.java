package arrays;

import java.util.Scanner;

public class SecondLargest {
    // Program to find the second largest element in an array

    static int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
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

        if (secondLargest(arr) < 0) {
            System.out.println("Second largest element doesn't exist");
        } else {
            System.out.println("Second largest element is: " + secondLargest(arr));
        }

        scanner.close();
    }
}
