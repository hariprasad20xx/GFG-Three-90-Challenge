package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class StrongestNeighbour {

    static ArrayList<Integer> maxAdjacent(int[] arr) {
        ArrayList<Integer> strongNeighbours = new ArrayList<>();
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                strongNeighbours.add(arr[i + 1]);
            } else {
                strongNeighbours.add(arr[i]);
            }
        }
        
        return strongNeighbours;
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
