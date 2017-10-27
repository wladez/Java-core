package homework.collections;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Created by Владислав on 26.10.2017.
 */


public class PropertiesMap {
    private ResourceBundle bundle;
    private HashMap<String, String> map;

    public PropertiesMap(String name, Locale locale){
        bundle = ResourceBundle.getBundle(name, locale);
        map = new HashMap<String, String>();
    }

    public Map<String, String> getMapOfFile(){
        for (String e: bundle.keySet()) {
            map.put(e, bundle.getString(e));
        }

        return map;
    }

}
