public class Generics1<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        Generics1<Integer> intBox = new Generics1<>();
        intBox.setValue(10);
        System.out.println(intBox.getValue());

        Generics1<String> strBox = new Generics1<>();
        strBox.setValue("Hello");
        System.out.println(strBox.getValue());
    }
}
