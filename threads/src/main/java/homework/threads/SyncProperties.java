package homework.threads;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Владислав on 05.11.2017.
 */
public class SyncProperties {
    private ResourceBundle bundle;

    public SyncProperties(String name, Locale locale){
        synchronized (this) {
            bundle = ResourceBundle.getBundle(name, locale);
        }
    }

    public String getValue(String key){
        return bundle.getString(key);
    }
}
