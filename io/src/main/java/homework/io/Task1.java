package homework.io;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by Владислав on 19.10.2017.
 */
public class Task1 {

    public static void main(String[] args) {
        byte[] contents = new byte[1024];
        int bytesRead = 0;
        String strFileContents = "";
        try(BufferedInputStream in = new BufferedInputStream(
                new FileInputStream("./oop/src/main/java/homework/oop/AtomicBoat.java"))){
            while((bytesRead = in.read(contents)) != -1) {
                strFileContents += new String(contents, 0, bytesRead);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(strFileContents);
        JavaKeyWords jk = new JavaKeyWords();
        String result = jk.searchJavaKeyWords(strFileContents);
        try(BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream("./io/src/main/resources/output1.txt"))) {
            out.write(result.getBytes(Charset.forName("UTF-8")));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
