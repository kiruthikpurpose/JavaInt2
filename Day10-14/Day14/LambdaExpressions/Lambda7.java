interface StringLengthCalculator {
    int length(String str);
}

public class Lambda7 {
    public static void main(String[] args) {
        StringLengthCalculator lengthCalculator = str -> str.length();
        System.out.println(lengthCalculator.length("Lambda Expression"));
    }
}
