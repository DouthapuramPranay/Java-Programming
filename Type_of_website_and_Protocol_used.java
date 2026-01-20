public class Type_of_website_and_Protocol_used {
    public static void main(String[] args) {
        String url = "https://www.google.com";
        int i = url.indexOf(":");
        String a = url.substring(0, i);
        if (a.equals("https")) {
            System.out.println("Hyper Text Transport Protocol");
        } else if (a.equals("ftp")) {
            System.out.println("File Transport Protocol");
        }

        int j = (url.lastIndexOf(".") + 1);
        String b = url.substring(j, url.length());
        if (b.equals("com")) {
            System.out.println("Commercial Website");
        } else if (b.equals("Org")) {
            System.out.println("Organizational Website");
        } else if (b.equals("net")) {
            System.out.println("Network Website");
        }
    }

}
