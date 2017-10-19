package homework.strings;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * Created by Владислав on 15.10.2017.
 */
public class QuestionBundle {
    private ResourceBundle questions;
    private ResourceBundle answers;

    public QuestionBundle(Locale locale){
        questions = ResourceBundle.getBundle("questions", locale);
        answers = ResourceBundle.getBundle("answers", locale);
    }

    public void showAllQuestions() throws UnsupportedEncodingException {
        Set<String> questionKeySet = questions.keySet();
        for (String key: questionKeySet) {
            System.out.println(key + ". " + questions.getString(key));
        }
    }

    public void showAnswerOnQuestion(int key){
        System.out.println(key + ". " + answers.getString(key+""));
    }
}
