interface Operation {
    int operate(int a, int b);
}

public class Lambda2 {
    public static void main(String[] args) {
        Operation addition = (a, b) -> a + b;
        System.out.println(addition.operate(5, 3));
    }
}
