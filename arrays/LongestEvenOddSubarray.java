package arrays;

import java.util.Scanner;

public class LongestEvenOddSubarray {

    static int maxEvenOdd(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }

        int maxLength = 1;  // Start with a minimum length of 1
        int currLen = 1;    // Current alternating sequence length

        for (int i = 1; i < n; i++) {
            // Check if the current element is alternating with the previous one
            if (arr[i] % 2 != arr[i - 1] % 2) {
                currLen++;  // Continue the alternating sequence
            } else {
                maxLength = Math.max(maxLength, currLen);  // Update maxLength if needed
                currLen = 1;  // Reset current sequence length
            }
        }
        // Final check for the last sequence
        maxLength = Math.max(maxLength, currLen);
        
        // If maxLength is 1, no valid alternating subarray exists
        if (maxLength == 1) {
            return 0;
        }
        return maxLength;
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

        int maxLength = maxEvenOdd(arr, arr.length);

        System.out.println("Length of longest subarray of even and odds is : " + maxLength);
                
        scanner.close();
    }  
}
