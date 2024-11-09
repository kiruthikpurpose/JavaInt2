import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling6 {
    public static void main(String[] args) {
        int words = 0, characters = 0, lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();
                words += line.split("\\s+").length;
            }
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
