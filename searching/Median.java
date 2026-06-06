package searching;

import java.util.Scanner;

public class Median {

    static double median(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        if (n > m) {
            return median(B, A);
        }

        int start = 0;
		int end = n;
		int realMidInMergedArray = (n + m + 1) / 2;

        while (start <= end) {
			int mid = (start + end) / 2;
			int leftAsize = mid;
			int leftBsize = realMidInMergedArray - mid;
			int leftA = (leftAsize > 0) ? A[leftAsize - 1] : Integer.MIN_VALUE;										
			int leftB = (leftBsize > 0) ? B[leftBsize - 1] : Integer.MIN_VALUE;
			int rightA = (leftAsize < n) ? A[leftAsize] : Integer.MAX_VALUE;
			int rightB = (leftBsize < m) ? B[leftBsize] : Integer.MAX_VALUE;

			// if correct partition is done
			if (leftA <= rightB && leftB <= rightA) {
				if ((m + n) % 2 == 0) {
					return (Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0;
                }
				return Math.max(leftA, leftB);
			}
			else if (leftA > rightB) {
				end = mid - 1;
			}
			else
				start = mid + 1;
        }
        
        return 0.0;
    }

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

        System.out.print("Enter " + n2 + " elements for the array in ascending order: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        scanner.close();
    }
}
