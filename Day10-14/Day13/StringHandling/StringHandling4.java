public class StringHandling4 {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuffer buffer = new StringBuffer("Hello World");
        boolean isEqual = str.contentEquals(buffer);
        System.out.println("String equals StringBuffer: " + isEqual);
    }
}
