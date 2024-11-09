interface StringOperation {
    String concatenate(String a, String b);
}

public class Lambda5 {
    public static void main(String[] args) {
        StringOperation concatenate = (a, b) -> a + b;
        System.out.println(concatenate.concatenate("Hello, ", "World!"));
    }
}
