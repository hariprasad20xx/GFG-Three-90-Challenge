import java.util.ArrayList;
import java.util.Scanner;

public class QuadraticRoots {
    // Program to find roots of a quadratic equation
    public static ArrayList<Integer> findRoots(int a, int b, int c) {
        int d = b * b - (4 * a * c);
        
        ArrayList<Integer> roots = new ArrayList<>();
        
        if (d >= 0) {
            roots.add((int) Math.floor((-b + Math.sqrt(d)) / (2 * a)));
            roots.add((int) Math.floor((-b - Math.sqrt(d)) / (2 * a)));
        } else {
            roots.add(-1);
        }
        
        return roots;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the constants a, b and c separated by space: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        ArrayList<Integer> results = findRoots(a, b, c);
        
        if (results.get(0) == -1) {
            System.out.println("The roots are imaginary.");
        } else {
            System.out.println("The roots are: " + results.get(0) + " " + results.get(1));
        }
        
        scanner.close();
    }
}
