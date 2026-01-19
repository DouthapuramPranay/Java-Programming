public class RegularExpresssion {
    public static void main(String[] args) {
        int b = 110010101;
        String str1 = b + "";
        System.out.println(str1.matches("[01]*"));

        String str = "234AB";
        System.out.println(str.matches("[0-9A-F]+"));

        String str2 = "27/03/2005";
        System.out.println(str2.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));

    }
}
