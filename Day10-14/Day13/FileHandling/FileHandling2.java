import java.io.File;

public class FileHandling2 {
    public static void main(String[] args) {
        File file = new File("example.txt");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
    }
}
