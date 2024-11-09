interface MathOperation {
    double operate(double a, double b);
}

public class Lambda3 {
    public static void main(String[] args) {
        MathOperation multiplication = (a, b) -> a * b;
        System.out.println(multiplication.operate(4.5, 2.0));
    }
}
