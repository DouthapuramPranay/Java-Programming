public class StringMethods {
    public static void main(String[] args) {
        String str = "java";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.substring(1));
        System.out.println(str.substring(1, 3));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.startsWith("ja"));
        System.out.println(str.endsWith("va"));
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.equals("java"));
        System.out.println(str.equalsIgnoreCase("JAVA"));
        System.out.println(str.compareTo("java"));
        System.out.println(str.valueOf(1));
    }
}
