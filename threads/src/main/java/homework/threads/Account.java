package homework.threads;

/**
 * Created by Владислав on 05.11.2017.
 */
public class Account {
    private int balance;

    public Account(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount){
        balance += amount;
    }

    public synchronized void withdraw(int amount){
        balance -= amount;
    }

    public void transferTo(Account a, int amount){
        this.withdraw(amount);
        a.deposit(amount);
    }
}
