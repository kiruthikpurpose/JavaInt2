class PrintNumber {
    private boolean oddTurn = true;

    public synchronized void printOdd(int number) throws InterruptedException {
        while (!oddTurn) {
            wait();
        }
        System.out.println("Odd: " + number);
        oddTurn = false;
        notify();
    }

    public synchronized void printEven(int number) throws InterruptedException {
        while (oddTurn) {
            wait();
        }
        System.out.println("Even: " + number);
        oddTurn = true;
        notify();
    }
}

public class ThreadExample5 {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 10; i += 2) {
                try {
                    printNumber.printOdd(i);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                try {
                    printNumber.printEven(i);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        oddThread.start();
        evenThread.start();
    }
}
