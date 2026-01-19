public class LoginValidation {
    public static void main(String[] args) {
        String str1 = "Pranay@gmail.com";
        int i = str1.indexOf("@");
        String username = str1.substring(0, i);
        String domain = str1.substring(i + 1);
        System.out.println(username);
        System.out.println(domain);
        System.out.println(str1.matches("\\w*.gmail.*"));
    }

}
