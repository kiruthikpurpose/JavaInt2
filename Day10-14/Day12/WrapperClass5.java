public class WrapperClass5 {
    public static void main(String[] args) {
        int primitiveInt = 42;
        Integer integerObject = primitiveInt;
        int backToPrimitive = integerObject;
        System.out.println("Primitive to Integer: " + integerObject);
        System.out.println("Integer back to Primitive: " + backToPrimitive);
    }
}
