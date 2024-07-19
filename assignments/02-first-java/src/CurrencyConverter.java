import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        final double conversionRate = 0.012; // Example conversion rate
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();
        double usd = inr * conversionRate;
        System.out.println(inr + " INR is " + usd + " USD.");
        sc.close();
    }
}
