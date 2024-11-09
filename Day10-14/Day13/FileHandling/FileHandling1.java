import java.io.File;

public class FileHandling1 {
    public static void main(String[] args) {
        File file = new File("example.txt");
        System.out.println("Exists: " + file.exists());
    }
}
