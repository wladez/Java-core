package homework.io;

import java.io.*;

/**
 * Created by Владислав on 19.10.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        char[] contents = new char[1024];
        int charsRead;
        String strFileContents = "";
        try (BufferedReader reader = new BufferedReader(
                new FileReader("./oop/src/main/java/homework/oop/AtomicBoat.java"))) {
            while((charsRead = reader.read(contents)) != -1) {
                strFileContents += new String(contents, 0, charsRead);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(strFileContents);
        JavaKeyWords javaKeyWords = new JavaKeyWords();
        try(BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("./io/src/main/resources/output2.txt"))){
            bufferedWriter.write(javaKeyWords.searchJavaKeyWords(strFileContents));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
