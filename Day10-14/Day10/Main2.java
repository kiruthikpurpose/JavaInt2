public class Main2 {
    public static void checkEven(int number) throws Exception {
        if (number % 2 != 0) {
            throw new Exception("The number is odd.");
        }
    }

    public static void main(String[] args) {
        try {
            checkEven(3);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
