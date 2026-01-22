public class Display_number_in_words {
    public static void main(String[] args) {
        int n = 12300;
        String num = String.valueOf(n);

        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);

            switch (digit) {
                case '0':
                    System.out.println("zero");
                    break;
                case '1':
                    System.out.println("one");
                    break;
                case '2':
                    System.out.println("two");
                    break;
                case '3':
                    System.out.println("three");
                    break;
                case '4':
                    System.out.println("four");
                    break;
                case '5':
                    System.out.println("five");
                    break;
                case '6':
                    System.out.println("six");
                    break;
                case '7':
                    System.out.println("seven");
                    break;
                case '8':
                    System.out.println("eight");
                    break;
                case '9':
                    System.out.println("nine");
                    break;
            }
        }
    }
}
