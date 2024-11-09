public class Main7 {
    public static void checkVowels(String input) throws Exception {
        if (!input.toLowerCase().matches(".*[aeiou].*")) {
            throw new Exception("The string does not contain vowels.");
        }
    }

    public static void main(String[] args) {
        try {
            checkVowels("bcdfg");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
