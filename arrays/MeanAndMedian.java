package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MeanAndMedian {

    static int mean(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        return sum / arr.length;
    }

    static int median(int[] arr) {
        Arrays.sort(arr);
        
        int n = arr.length;
        if (n % 2 == 0) {
            return (arr[n/2] + arr[n/2 - 1]) / 2;
        } else {
            return arr[n/2];
        }
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

        int mean = mean(arr);
        int median = median(arr);

        System.out.println("Mean = " + mean + ", Median = " + median);

        scanner.close();
    }
}
