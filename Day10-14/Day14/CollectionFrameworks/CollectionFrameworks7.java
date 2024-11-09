import java.util.HashMap;
import java.util.Map;

public class CollectionFrameworks7 {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("USA", "Washington, D.C.");
        countries.put("France", "Paris");
        countries.put("Japan", "Tokyo");

        System.out.println("Capital of USA: " + countries.get("USA"));
        System.out.println("Countries and Capitals: " + countries);
    }
}
