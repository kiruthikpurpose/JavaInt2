import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionFrameworks10 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(set);
    }
}
