public class Display_Digits_of_a_number {
    public static void main(String[] args) {
        int n = 123;
        while (n > 0) {
            int digit = n % 10;
            System.out.println(digit);
            n = n / 10;

        }
    }
}
