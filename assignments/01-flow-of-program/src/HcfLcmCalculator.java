import java.util.Scanner;

public class HcfLcmCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number for HCF and LCM: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number for HCF and LCM: ");
        int n2 = sc.nextInt();
        int hcf = findHCF(n1, n2);
        int lcm = (n1 * n2) / hcf;
        System.out.println("HCF of " + n1 + " and " + n2 + " is: " + hcf);
        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);
        sc.close();
    }

    // Method to find HCF
    public static int findHCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findHCF(b, a % b);
    }
}
