package arrays;

import java.util.Scanner;

public class MajorityElement {

    static void printMajority(int[] a, int size) {
        
        int cand = findCandidate(a, size);
		if (isMajority(a, size, cand))
			System.out.println(" " + cand + " ");
		else
			System.out.println("No Majority Element");
    }
    

    static int findCandidate(int[] a, int size) {

    }

    static boolean isMajority(int a[], int size, int cand) {
        return true;
    }
    
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        scanner.close();
    }
}
