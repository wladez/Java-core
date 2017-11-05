package homework.threads;

/**
 * Created by Владислав on 05.11.2017.
 */
public class OperatorWithLock extends Thread {
    private AccountWithLock account1;
    private AccountWithLock account2;
    private int amount;

    public OperatorWithLock(AccountWithLock account1, AccountWithLock account2, int amount){
        this.account1 = account1;
        this.account2 = account2;
        this.amount = amount;
    }

    @Override
    public void run(){
        for(int i = 0; i<3; i++){
            account1.transferTo(account2, amount);
        }
    }
}
