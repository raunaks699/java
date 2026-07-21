
Write  a  java  program  to  find  ODD  or  EVEN  number  using
command  line argument
public class OddEven {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java OddEven <number>");
            return;
        }

        int num = Integer.parseInt(args[0]);

        if (num % 2 == 0) {
            System.out.println(num + " is an EVEN number.");
        } else {
            System.out.println(num + " is an ODD number.");
        }
    }
}
