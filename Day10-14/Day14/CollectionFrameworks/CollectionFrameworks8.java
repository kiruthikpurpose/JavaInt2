import java.util.HashMap;
import java.util.Map;

public class CollectionFrameworks8 {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        students.put("Alice", "A");
        students.put("Bob", "B");
        students.put("Charlie", "A+");

        students.put("Alice", "A+");
        System.out.println(students);
    }
}
