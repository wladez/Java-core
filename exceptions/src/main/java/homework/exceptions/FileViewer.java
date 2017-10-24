package homework.exceptions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileViewer {
    public void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            System.out.println(fileEntry.getName());
        }
    }

    public void createTextFile(String name, String extension, File directory){
        if(extension != ".txt"){
            System.out.println("Wrong file extension!");
            return;
        }

        try{
            Files.createFile(Paths.get(directory.toString(),name+extension));
        }catch (IOException e){
            System.out.println("File has not created! " + e);
        }
    }

    public void deleteTextFile(String name, String extension, File directory){
        if(extension != ".txt"){
            System.out.println("Wrong file extension!");
            return;
        }

        try {
            Files.delete(Paths.get(directory.toString(),name+extension));
        }catch (IOException e){
            System.out.println("File has not deleted! " + e);
        }
    }

    public void writeWithAppendToFile(String filePath, String text){
        try(BufferedWriter writer = new BufferedWriter(
                new FileWriter(filePath, true))){
            writer.write(text);
        }
        catch (IOException e){
            System.out.println("Couldn't write to specified file! " + e);
        }
    }

    public void overwriteFile(String filePath, String text){
        try(BufferedWriter writer = new BufferedWriter(
                new FileWriter(filePath))){
            writer.write(text);
        }
        catch (IOException e){
            System.out.println("Couldn't write to specified file! " + e);
        }
    }
}
