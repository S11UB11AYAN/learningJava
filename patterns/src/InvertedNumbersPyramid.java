import java.util.Scanner;

public class InvertedNumbersPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
