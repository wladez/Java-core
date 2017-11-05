package homework.threads;

import java.util.Locale;

/**
 * Created by Владислав on 05.11.2017.
 */
public class PropertiesOperator extends Thread {
    private SyncProperties syncProperties;

    public PropertiesOperator(){
    }

    @Override
    public void run(){
        syncProperties = new SyncProperties("sync", new Locale("en"));
        System.out.println(syncProperties.getValue("1"));
    }
}
