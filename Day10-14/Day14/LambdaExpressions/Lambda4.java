interface MaxFinder {
    int findMax(int a, int b);
}

public class Lambda4 {
    public static void main(String[] args) {
        MaxFinder max = (a, b) -> a > b ? a : b;
        System.out.println(max.findMax(7, 9));
    }
}
