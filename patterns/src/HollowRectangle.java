import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height and width: ");
        int height = input.nextInt();
        int width = input.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || j == 1 || i == height || j == width) {
                    System.out.print(" *");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

}
