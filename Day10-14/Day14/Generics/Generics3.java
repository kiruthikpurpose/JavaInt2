interface Pair<K, V> {
    K getKey();
    V getValue();
}

public class Generics3<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public Generics3(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Generics3<String, Integer> pair = new Generics3<>("Age", 30);
        System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
    }
}
