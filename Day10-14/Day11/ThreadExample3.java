class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class ThreadExample3 implements Runnable {
    private BankAccount account;
    private boolean deposit;

    public ThreadExample3(BankAccount account, boolean deposit) {
        this.account = account;
        this.deposit = deposit;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (deposit) {
                account.deposit(10);
            } else {
                account.withdraw(10);
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread t1 = new Thread(new ThreadExample3(account, true));
        Thread t2 = new Thread(new ThreadExample3(account, false));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
