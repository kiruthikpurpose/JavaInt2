import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main5 {
    public static void checkFileNotEmpty(String fileName) throws Exception {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        if (!scanner.hasNext()) {
            scanner.close();
            throw new Exception("The file is empty.");
        }
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        try {
            checkFileNotEmpty("file.txt");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
