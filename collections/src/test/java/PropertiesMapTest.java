import homework.collections.PropertiesMap;
import org.junit.Test;

import java.util.Locale;

public class PropertiesMapTest {
    @Test
    public void testPropertiesMap() throws Exception {
        PropertiesMap propertiesMap = new PropertiesMap("map", new Locale("en_US"));
        System.out.println(propertiesMap.getMapOfFile());
    }

}