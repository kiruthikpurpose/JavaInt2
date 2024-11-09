public class ThreadExample1 implements Runnable {
    private String threadName;

    public ThreadExample1(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadExample1("Thread 1"));
        Thread thread2 = new Thread(new ThreadExample1("Thread 2"));

        thread1.start();
        thread2.start();
    }
}
