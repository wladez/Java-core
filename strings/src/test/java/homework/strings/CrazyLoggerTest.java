package homework.strings;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Владислав on 15.10.2017.
 */
public class CrazyLoggerTest {
    @Test
    public void crazyLoggerTest() throws IOException {
        CrazyLogger crazyLogger = new CrazyLogger();
        crazyLogger.addMessage("Hello!");
        crazyLogger.addMessage("Java Strings");
        crazyLogger.addMessage("Bye!");
        crazyLogger.printAllLog();
        assertThat(-1, is(crazyLogger.findInLog("go")));
        StringWriter stringWriter = new StringWriter();
        crazyLogger.getInformationInOutputStream("Java", stringWriter);
        crazyLogger.getInformationInOutputStream("fdf", stringWriter);
        stringWriter.close();
    }

}