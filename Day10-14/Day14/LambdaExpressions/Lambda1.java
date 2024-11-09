public class Lambda1 {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Running in a thread");
        new Thread(runnable).start();
    }
}
