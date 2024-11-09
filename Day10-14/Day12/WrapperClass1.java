import java.util.ArrayList;
import java.util.List;

public class WrapperClass1 {
    public static List<Integer> parseStringListToIntList(List<String> stringList) {
        List<Integer> intList = new ArrayList<>();
        for (String str : stringList) {
            try {
                intList.add(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return intList;
    }
}
