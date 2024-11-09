import java.util.HashMap;
import java.util.Map;

public class CollectionFrameworks6 {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Alice", "12345");
        phoneBook.put("Bob", "67890");
        phoneBook.put("Charlie", "54321");

        phoneBook.put("David", "98765");
        phoneBook.remove("Charlie");
        System.out.println("Search: " + phoneBook.get("Alice"));
        System.out.println("Contacts: " + phoneBook);
    }
}
