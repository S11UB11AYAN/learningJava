import java.util.Scanner;

public class PalindromicPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == 1) {
                    continue;
                } else
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}
