import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionFrameworks5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Banana", "Apple", "Cherry"));
        Collections.sort(list);
        System.out.println(list);
    }
}
