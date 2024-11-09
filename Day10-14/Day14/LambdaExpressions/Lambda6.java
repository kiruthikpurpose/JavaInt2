interface NumberChecker {
    boolean isEven(int a);
}

public class Lambda6 {
    public static void main(String[] args) {
        NumberChecker isEven = a -> a % 2 == 0;
        System.out.println(isEven.isEven(4));
    }
}
