package homework.io;

import java.io.*;
import java.nio.charset.Charset;

public class Task3 {
    public static void main(String[] args) {
        char[] content = new char[1024];
        int charsRead;
        String text = "";
        try(BufferedReader reader = new BufferedReader(
                new FileReader("./io/src/main/resources/input.txt"))){
            while((charsRead = reader.read(content)) != -1) {
                text += new String(content, 0, charsRead);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(text);
        try(BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("./io/src/main/resources/output3.txt"), Charset.forName("UTF-16")))){
            writer.write(text);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
