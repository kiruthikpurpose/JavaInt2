import java.util.Scanner;

public class WrapperClass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        try {
            Double.parseDouble(input);
            System.out.println("The string can be converted to a double.");
        } catch (NumberFormatException e) {
            System.out.println("The string cannot be converted to a double.");
        }
    }
}
