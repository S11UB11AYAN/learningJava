import java.util.Scanner;

public class SolidRohmbus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= height; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
