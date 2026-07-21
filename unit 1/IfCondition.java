
Write a java program to use IF Condition
import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Using if condition
        if (num > 0) {
            System.out.println("The number is Positive.");
        }

        sc.close();
    }
}
