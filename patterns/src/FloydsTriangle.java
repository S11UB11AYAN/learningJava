import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int height = input.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
