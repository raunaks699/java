
Write a java program to get the name from user and print 10 times using
loop.
import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input name from user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Print the name 10 times using a loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". " + name);
        }

        sc.close();
    }
}
