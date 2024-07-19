import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSum = 0;
        System.out.println("Enter numbers to sum (enter 'x' to stop):");
        while (sc.hasNextInt()) {
            totalSum += sc.nextInt();
        }
        sc.next(); // Consume the 'x' input
        System.out.println("Sum of entered numbers is: " + totalSum);
        sc.close();
    }
}
