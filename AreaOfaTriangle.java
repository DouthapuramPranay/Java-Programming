import java.util.*;

public class AreaOfaTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b = scanner.nextDouble();
        double h = scanner.nextDouble();
        double area = 0.5 * b * h;
        System.out.println("Area of Triangle is: " + area);
    }
}