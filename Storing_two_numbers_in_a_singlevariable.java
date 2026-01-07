public class Storing_two_numbers_in_a_singlevariable {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 12;
        int c;
        c = num1 << 4;
        c = c | num2;
        System.out.println("First number: " + (c >> 4));
        System.out.println("Second number: " + (c & 15));
        System.out.println("Combined number: " + c);

    }

}
