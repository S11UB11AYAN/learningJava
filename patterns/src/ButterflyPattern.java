import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (2 * height) - (2 * i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 1; j <= height; j++) {
            for (int i = 1; i <= height - j + 1; i++) {
                System.out.print("*");
            }
            for (int i = 2; i < j * 2; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= height - j + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
