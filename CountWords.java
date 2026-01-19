public class CountWords {
    public static void main(String[] args) {
        String str = "Pranay is a Java Developer";
        String words[] = str.split("\\s");
        System.out.println(words.length);

    }
}