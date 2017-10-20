package homework.io;

/**
 * Created by Владислав on 19.10.2017.
 */
public class JavaKeyWords {
    public String[] javaKeyWords = {"abstract",	"continue",	"for", "new", "switch", "assert", "default", "goto",
            "package", "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected",
            "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient",
            "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class",
            "finally", "long", "strictfp", "volatile", "const",	"float", "native",	"super", "while"};

    public String searchJavaKeyWords(String code){
        StringBuilder stringBuilder = new StringBuilder();
        for (String elem: javaKeyWords) {
            int count = getWordCount(code, elem);
            if(count > 0)
                stringBuilder.append(elem + " " + count +"; ");
        }
        return stringBuilder.toString();
    }

    private int getWordCount(String code, String word){
        int count = 0;
        int index;
        index = code.indexOf(word);
        if (index == -1)
            return -1;
        else{
            count++;
            while (index > 0) {
                index = code.indexOf(word, index+1);
                if(index != -1){
                    count++;
                }
                else
                    return count;
            }
            return count;
        }
    }
}
