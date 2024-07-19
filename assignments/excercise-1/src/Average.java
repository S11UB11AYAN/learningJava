import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int average = average(num1, num2, num3);
        System.out.println("Average = " + average);
    }

    public static int average(int num1, int num2, int num3) {
        return ((num1 + num2 + num3) / 3);
    }
}
