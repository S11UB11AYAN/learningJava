import java.util.Scanner;

public class ArmstrongNumberFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int low = sc.nextInt();
        System.out.print("Enter the upper bound: ");
        int high = sc.nextInt();

        System.out.println("Armstrong numbers between " + low + " and " + high + ":");
        for (int num = low; num <= high; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }

        sc.close();
    }

    public static boolean isArmstrong(int num) {
        int original = num, sum = 0, digits = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }
}
