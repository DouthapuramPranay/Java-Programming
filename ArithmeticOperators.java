public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        int result1 = a + b * c;
        int result2 = (a + b) * c;

        System.out.println("Without parentheses: " + result1);
        System.out.println("With parentheses: " + result2);

        double d = 10.0 / 3;
        char ch = 'A';
        int asciiCalc = ch + 5;

        System.out.println("Double division: " + d);
        System.out.println("Char arithmetic: " + asciiCalc);
    }
}