package homework.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Владислав on 05.11.2017.
 */
public class AccountWithLock {
    private int balance;
    private Lock locker;

    public AccountWithLock(int balance){
        this.balance = balance;
        locker = new ReentrantLock();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        locker.lock();
        balance += amount;
        locker.unlock();
    }

    public void withdraw(int amount){
        locker.lock();
        balance -= amount;
        locker.unlock();
    }

    public void transferTo(AccountWithLock a, int amount){
        this.withdraw(amount);
        a.deposit(amount);
    }
}
