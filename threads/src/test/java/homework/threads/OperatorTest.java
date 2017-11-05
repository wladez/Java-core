package homework.threads;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Владислав on 05.11.2017.
 */
public class OperatorTest {
    @Test
    public void run() throws Exception {
        Account account1 = new Account(300);
        Account account2 = new Account(500);

        Operator op1 = new Operator(account1, account2, 50);
        Operator op2 = new Operator(account2, account1, 100);

        op1.start();
        op2.start();

        op1.join();
        op2.join();

        System.out.println("Account1 - " + account1.getBalance());
        System.out.println("Account2 - " + account2.getBalance());

    }

    @Test
    public void runWithLock() throws Exception {
        AccountWithLock account1 = new AccountWithLock(300);
        AccountWithLock account2 = new AccountWithLock(500);

        OperatorWithLock op1 = new OperatorWithLock(account1, account2, 50);
        OperatorWithLock op2 = new OperatorWithLock(account2, account1, 100);

        op1.start();
        op2.start();

        op1.join();
        op2.join();

        System.out.println("Account1 - " + account1.getBalance());
        System.out.println("Account2 - " + account2.getBalance());

    }

}