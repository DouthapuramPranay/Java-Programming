import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        if (num.matches("[01]+")) {
            System.out.println("Radix Number-Binary");
        } else if (num.matches("[0-7]+")) {
            System.out.println("Radix Number-Octal");
        } else if (num.matches("[0-9]+")) {
            System.out.println("Radix Number-Decimal");
        } else if (num.matches("[0-9A-F]+")) {
            System.out.println("Radix Number-HexaDecimal");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
