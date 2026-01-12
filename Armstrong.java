import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int count = 0;
        int temp = a;
        int temp2 = a;
        while (a > 0) {
            a /= 10;
            count++;
        }
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
            temp /= 10;
        }
        if (sum == temp2) {
            System.out.println("The given number is an Armstrong number");
        } else {
            System.out.println("The given number is not an Armstrong number");
        }
    }
}