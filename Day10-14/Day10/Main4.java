import java.io.File;
import java.util.Scanner;

public class Main4 {
    public static void checkNegativeNumbers(String fileName) throws Exception {
        Scanner fileScanner = new Scanner(new File(fileName));
        while (fileScanner.hasNextInt()) {
            int number = fileScanner.nextInt();
            if (number > 0) {
                fileScanner.close();
                throw new Exception("Found a positive number: " + number);
            }
        }
        fileScanner.close();
    }

    public static void main(String[] args) {
        try {
            checkNegativeNumbers("numbers.txt");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
