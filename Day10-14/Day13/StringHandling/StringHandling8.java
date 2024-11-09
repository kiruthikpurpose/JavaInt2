public class StringHandling8 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" World");
        buffer.insert(5, ",");
        buffer.replace(6, 11, "Universe");
        buffer.delete(6, 14);
        buffer.reverse();
        System.out.println("StringBuffer result: " + buffer);

        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" World");
        builder.insert(5, ",");
        builder.replace(6, 11, "Universe");
        builder.delete(6, 14);
        builder.reverse();
        System.out.println("StringBuilder result: " + builder);
    }
}
