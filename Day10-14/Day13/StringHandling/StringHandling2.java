public class StringHandling2 {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = str.codePointCount(0, str.length());
        System.out.println("Unicode code points count: " + count);
    }
}
