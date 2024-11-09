public class StringHandling10 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello World");
        String substring = buffer.substring(0, 5);
        CharSequence subsequence = buffer.subSequence(0, 5);
        System.out.println("Substring: " + substring);
        System.out.println("Subsequence: " + subsequence);
    }
}
