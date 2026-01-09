public class Strings {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = new String("JAVA");
        char c[] = { 'J', 'A', 'V', 'A' };
        byte b[] = { 65, 66, 67, 68 };
        String str3 = new String(c);
        String str4 = new String(b);
        String str5 = new String(b, 2, 2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);

        String str6 = "Java";
        String str7 = "Java";
        String str8 = "java";
        System.out.println(str6 == str7);
        System.out.println(str6 == str8);

    }
}
