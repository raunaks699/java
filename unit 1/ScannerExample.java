
Write a java program to get different values from user at runtime using
Scanner.
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Double input
        System.out.print("Enter a decimal number: ");
        double decimal = sc.nextDouble();

        // Character input
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // String input
        sc.nextLine(); // Consume leftover newline
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Display values
        System.out.println("\nEntered Values:");
        System.out.println("Integer: " + num);
        System.out.println("Decimal: " + decimal);
        System.out.println("Character: " + ch);
        System.out.println("Name: " + name);

        sc.close();
    }
}
