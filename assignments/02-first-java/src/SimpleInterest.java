import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal (P): ");
        double principal = sc.nextDouble();
        System.out.print("Enter time (T) in years: ");
        double time = sc.nextDouble();
        System.out.print("Enter rate (R): ");
        double rate = sc.nextDouble();
        double simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);
        sc.close();
    }
}
