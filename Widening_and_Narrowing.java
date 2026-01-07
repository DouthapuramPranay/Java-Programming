public class Widening_and_Narrowing {
    public static void main(String[] args) {
        byte b = 10;
        short s = 10;
        int i = 10;
        long l = 10;
        float f = 10;
        double d = 10;
        char ch = 'A';
        boolean bool = true;

        s = b;
        i = b;
        l = b;
        f = b;
        d = b;
        i = s;
        l = s;
        f = s;
        d = s;
        b = (byte) s; // should take below 127,if more data will be lost
        i = ch;
        l = ch;
        f = ch;
        i = (int) f;// can loose data

    }
}
