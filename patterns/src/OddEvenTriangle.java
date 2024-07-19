import java.util.Scanner;

public class OddEvenTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}
