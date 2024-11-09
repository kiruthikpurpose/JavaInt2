import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main6 {
    public static void checkForDuplicates() throws Exception {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();
        System.out.println("Enter integers (type 'q' to quit):");

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (!numbers.add(number)) {
                scanner.close();
                throw new Exception("Duplicate number found: " + number);
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        try {
            checkForDuplicates();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
