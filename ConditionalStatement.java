public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 14 && age <= 55) {
            System.out.println("young");
        } else if (age < 14) {
            System.out.println("child");
        } else {
            System.out.println("Not Young");
        }
    }
}
