package homework.threads;

import java.util.Random;

/**
 * Created by Владислав on 05.11.2017.
 */
public class IntegerSetterGetter extends Thread {
    private SharedResource resource;
    private boolean run;

    private Random rand = new Random();

    public IntegerSetterGetter(String name, SharedResource resource) {
        super(name);
        this.resource = resource;
        run = true;
    }

    public void stopThread() {
        run = false;
    }

    public void run() {
        int action;

        try {
            while (run) {
                action = rand.nextInt(1000);
                if (action % 2 == 0) {
                    getIntegersFromResource();
                } else {
                    setIntegersIntoResource();
                }
            }
            System.out.println("Поток " + getName() + " завершил работу.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void getIntegersFromResource() throws InterruptedException {
        Integer number;

        synchronized (resource) {
            System.out.println("Поток " + getName()
                    + " хочет извлечь число.");
            do {
                number = resource.getELement();
                if (checkBlockedThreads()) {
                    System.out.println("Поток " + getName()
                            + " ждет пока очередь заполнится.");
                    resource.wait();
                    System.out
                            .println("Поток " + getName() + " возобновил работу.");
                    number = resource.getELement();
                }
                else
                    setIntegersIntoResource();
            }while (number == null);
            System.out
                    .println("Поток " + getName() + " извлек число " + number);
        }
    }

    private void setIntegersIntoResource() throws InterruptedException {
        Integer number = rand.nextInt(500);
        synchronized (resource) {
            resource.setElement(number);
            System.out.println("Поток " + getName() + " записал число "
                    + number);
            resource.notifyAll();
        }
    }

    private boolean checkBlockedThreads(){
        Thread[] list = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(list);
        int count = 0;
        for (Thread t: list) {
            if(t.getState() == State.RUNNABLE){
                count++;
            }
        }
        if(count > 2)
            return true;
        else
            return false;
    }
}
