import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionFrameworks3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 2, 3, 4, 4, 5));
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }
}
