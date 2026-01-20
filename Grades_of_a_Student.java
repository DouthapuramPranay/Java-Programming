import java.util.Scanner;

public class Grades_of_a_Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Telugu = sc.nextInt();
        int Hindi = sc.nextInt();
        int English = sc.nextInt();
        int Maths = sc.nextInt();
        int Science = sc.nextInt();
        int Social = sc.nextInt();

        float n = (Telugu + Hindi + English + Maths + Science + Social) / 6.0f;
        if (n >= 90) {
            System.out.println("Grade:A");
        } else if (n > 80 && n <= 90) {
            System.out.println("Grade:B");
        } else if (n > 70 && n <= 80) {
            System.out.println("Grade:C");
        } else if (n > 60 && n <= 70) {
            System.out.println("Grade:D");
        } else {
            System.out.println("Fail");
        }

    }
}
