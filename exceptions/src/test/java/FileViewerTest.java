import homework.exceptions.FileViewer;
import org.junit.Test;

import java.io.File;

public class FileViewerTest {
    @Test
    public void testFileViewer() throws Exception {
        File folder = new File("D:\\");
        FileViewer fileViewer = new FileViewer();
        fileViewer.listFilesForFolder(folder);
        System.out.println("-------------");
        fileViewer.createTextFile("java", ".txt", folder);
        fileViewer.listFilesForFolder(folder);
        fileViewer.deleteTextFile("java5923255609276073176", ".txt", folder);
        fileViewer.overwriteFile(folder.toString()+"java.txt", "AAAAA\n");
        fileViewer.writeWithAppendToFile(folder.toString()+"java.txt", "Java");
    }

}