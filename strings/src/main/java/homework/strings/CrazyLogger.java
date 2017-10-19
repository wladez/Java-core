package homework.strings;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * Created by Владислав on 15.10.2017.
 */
public class CrazyLogger {
    private StringBuilder log;

    public CrazyLogger(){
        log = new StringBuilder();
    }

    public void addMessage(String message){
        Instant instant = Instant.now();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-YYYY : hh-mm").withZone(ZoneId.systemDefault());
        log.append(formatter.format(instant) + " - " + message + ";\n");
    }

    public int findInLog(String string){
        return log.indexOf(string);
    }

    public void getInformationInOutputStream(String string, Writer writer){
        if(log.indexOf(string) == -1)
            System.out.println("No such information in log");
        else{
            int beginIndex = log.indexOf(string);
            int endIndex = log.indexOf(";", beginIndex);
            try {
                writer.write(log.substring(beginIndex, endIndex));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void printAllLog(){
        System.out.println(log);
    }
}
