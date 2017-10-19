package homework.strings;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PicturesRegEx {

    public void getAllSentences(String text){
        Pattern p = Pattern.compile("[^<>.!?\\s][^.!?<>]*(\\([Рр]ис\\. \\d\\))[^.!?]*[.!?]?['\"]?(?=\\s|$)");
        Matcher m = p.matcher(text);
        while (m.find()){
            System.out.println("Found " + m.group(0));
        }
    }

    public boolean checkSequenceOfPictures(String text){
        Pattern p = Pattern.compile("\\([Рр]ис\\. \\d\\)");
        Matcher m = p.matcher(text);
        int tmp = 0;
        while (m.find()){
            System.out.println("Check " + m.group(0));
            if(tmp == 0)
                tmp = Integer.parseInt(String.valueOf(m.group(0).charAt(m.group(0).length()-2)));
            else if(tmp > Integer.parseInt(String.valueOf(m.group(0).charAt(m.group(0).length()-2))))
                return false;
            tmp = Integer.parseInt(String.valueOf(m.group(0).charAt(m.group(0).length()-2)));
        }
        return true;
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("./strings/src/main/resources/Java.SE.03.Information handling_task_attachment.html"), StandardCharsets.UTF_8))){
            String line;
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        PicturesRegEx e = new PicturesRegEx();
        e.getAllSentences(stringBuilder.toString());
        System.out.println(e.checkSequenceOfPictures(stringBuilder.toString()));
    }
}
