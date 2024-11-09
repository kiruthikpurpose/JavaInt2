import java.util.Arrays;
import java.util.List;

public class CollectionFrameworks2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 5, 30, 15);
        int max = list.stream().max(Integer::compare).get();
        int min = list.stream().min(Integer::compare).get();
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
        System.out.println("Sum: " + sum);
    }
}
