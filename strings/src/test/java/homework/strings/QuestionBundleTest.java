package homework.strings;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

/**
 * Created by Владислав on 15.10.2017.
 */
public class QuestionBundleTest {
    @Test
    public void questionsInEnglish() throws Exception {
        QuestionBundle questionBundle = new QuestionBundle(new Locale("en"));
        questionBundle.showAllQuestions();
        questionBundle.showAnswerOnQuestion(1);
        questionBundle.showAnswerOnQuestion(2);
    }

    @Test
    public void questionsInRussian() throws Exception{
        QuestionBundle questionBundle = new QuestionBundle(Locale.getDefault());
        questionBundle.showAllQuestions();
        questionBundle.showAnswerOnQuestion(1);
        questionBundle.showAnswerOnQuestion(2);
    }

}