import java.util.*;

public class RootsofQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double discriminant = b * b - 4 * a * c;

        Double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        Double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.printf("Roots of Quadratic Equation are: %.2f and %.2f ", r1, r2);

    }
}
