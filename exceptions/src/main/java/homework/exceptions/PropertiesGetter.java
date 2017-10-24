package homework.exceptions;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class PropertiesGetter {
    private ResourceBundle propertyFile;

    public PropertiesGetter(String name, Locale locale){
        try {
            propertyFile = ResourceBundle.getBundle(name, locale);
        }
        catch (MissingResourceException e){
            System.out.println("No such file can be found! " + e);
        }
    }

    public String getValueByKey(String key){
        String result = null;
        try{
            result = propertyFile.getString(key);
            System.out.println("Key - " + key + ", value - " + result);
        }
        catch (MissingResourceException e){
            System.out.println("No such key! " + e);
        }
        return result;
    }
}
