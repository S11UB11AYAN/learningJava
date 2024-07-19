import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        greetings(name);
        System.out.println("Sum = " + sum(3, 4));
    }

    public static void greetings(String name) {
        System.out.println("Hello " + name);
    }

    public static int sum(int num1, int num2) {
        return (num1 + num2);
    }
}
