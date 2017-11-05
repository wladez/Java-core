package homework.threads;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

/**
 * Created by Владислав on 05.11.2017.
 */
public class SyncPropertiesTest {
    @Test
    public void getValue() throws Exception {
        PropertiesOperator pr1 = new PropertiesOperator();
        PropertiesOperator pr2 = new PropertiesOperator();

        pr1.start();
        pr2.start();

        pr1.join();
        pr2.join();

        System.out.println("Done");
    }

}