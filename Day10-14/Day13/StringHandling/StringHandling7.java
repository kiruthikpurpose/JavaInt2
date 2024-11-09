public class StringHandling7 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char c : alphabet.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println("\n=============================");
        for (char c : alphabet.toCharArray()) {
            System.out.print(str.indexOf(c) + " ");
        }
    }
}
