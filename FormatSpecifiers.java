
public class FormatSpecifiers {
    public static void main(String[] args) {
        int x = 6;
        int k = -6;
        float f = 5.678f;
        char z = 'A';
        String str = "Hello World";
        System.out.printf("%d\n", x);
        System.out.printf("%f\n", f);
        System.out.printf("%c\n", z);
        System.out.printf("%s\n", str);
        System.out.printf("%1$d %2$f %3$c %4$s\n", x, f, z, str);
        System.out.printf("%3$c %2$f %1$d %4$s\n", x, f, z, str);
        System.out.printf("%5d\n", x);
        System.out.printf("%05d\n", x);
        System.out.printf("%(5d\n", x);
        System.out.printf("%(5d\n", k);
        System.out.printf("%-5d\n", x);
        System.out.printf("%s\n", str);
        System.out.printf("%20s\n", str);
        System.out.printf("%-20s\n", str);
        System.out.printf("%.3f\n", f);
        System.out.printf("%.2f\n", f);

    }
}
