import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = height; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
