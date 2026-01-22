public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, 3);
            n = n / 10;

        }
        if (temp == sum) {
            System.out.println("armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

    }
}
