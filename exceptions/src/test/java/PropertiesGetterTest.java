import homework.exceptions.PropertiesGetter;
import org.junit.Test;

import java.util.Locale;
import java.util.MissingResourceException;

public class PropertiesGetterTest {
    @Test
    public void testPropertiesGetter() throws Exception {
        PropertiesGetter getter = new PropertiesGetter("file", Locale.getDefault());
        getter.getValueByKey("1");
    }

}