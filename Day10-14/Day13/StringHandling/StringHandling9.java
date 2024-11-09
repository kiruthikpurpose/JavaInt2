public class StringHandling9 {
    public static boolean isPalindrome(String str) {
        StringBuffer buffer = new StringBuffer(str);
        return str.equals(buffer.reverse().toString());
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println("Is palindrome: " + isPalindrome(str));
    }
}
