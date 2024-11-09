public class WrapperClass4 {
    public static void main(String[] args) {
        String intStr = "123";
        String doubleStr = "123.45";
        String boolStr = "true";
        int intValue = Integer.parseInt(intStr);
        double doubleValue = Double.parseDouble(doubleStr);
        boolean boolValue = Boolean.parseBoolean(boolStr);
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Boolean: " + boolValue);
    }
}
