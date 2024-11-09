public class StringHandling1 {
    public static void main(String[] args) {
        String str = "Hello World";
        int index = 4;
        int codePoint = str.codePointAt(index);
        System.out.println("Unicode code point at index " + index + ": " + codePoint);
    }
}
