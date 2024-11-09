import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling5 {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("source.txt");
             FileOutputStream out = new FileOutputStream("destination.txt")) {
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
