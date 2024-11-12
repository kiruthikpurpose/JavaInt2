interface NumberChecker {
    boolean isEven(int a);
}

public class Lambda6 {
    public static void main(String[] args) {
        NumberChecker isEvenObj = a -> a % 2 == 0;
        System.out.println(isEvenObj.isEven(4));
    }
}
