public class Operators {
    public static void main(String[] args) {
        int x = 10, y = 5;

        // 🔹 Bitwise Operators
        System.out.println("Bitwise AND (x & y): " + (x & y));
        System.out.println("Bitwise OR  (x | y): " + (x | y));
        System.out.println("Bitwise XOR (x ^ y): " + (x ^ y));
        System.out.println("Bitwise NOT (~x): " + (~x));
        System.out.println("Left Shift (x << 1): " + (x << 1));
        System.out.println("Right Shift (x >> 1): " + (x >> 1));

        // 🔹 Increment & Decrement
        System.out.println("x before increment: " + x);
        System.out.println("Post-increment (x++): " + (x++));
        System.out.println("After post-increment: " + x);
        System.out.println("Pre-increment (++x): " + (++x));
        System.out.println("y before decrement: " + y);
        System.out.println("Post-decrement (y--): " + (y--));
        System.out.println("After post-decrement: " + y);
        System.out.println("Pre-decrement (--y): " + (--y));

        // 🔹 Relational Operators
        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y));
        System.out.println("x > y  : " + (x > y));
        System.out.println("x < y  : " + (x < y));
        System.out.println("x >= y : " + (x >= y));
        System.out.println("x <= y : " + (x <= y));

        // 🔹 Logical Operators
        boolean cond1 = (x > 0);
        boolean cond2 = (y > 0);
        System.out.println("cond1 && cond2 : " + (cond1 && cond2));
        System.out.println("cond1 || cond2 : " + (cond1 || cond2));
        System.out.println("!cond1 : " + (!cond1));
    }
}
