public class RemoveSpecialCharacersfromaString {
    public static void main(String[] args) {
        String str = "Pr@na#y$% ^&*()is a Ja!va Devel^oper";
        String result = str.replaceAll("[^a-zA-Z0-9 ]", "");
        System.out.println(result);

        String str1 = "H E l l o w O R L D";
        String result1 = str1.replaceAll("\\s", "");
        System.out.println(result1);
    }
}
