package testing;

import app.java.dao.Question;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionTest {

    @Test
    public void constructor(){
        String query = "What is 1 + 1";
        String correctAnswer = "2";
        List<String> answers = new ArrayList<String>(Arrays.asList("0", "3", "5", "2"));
        Question question = new Question(query, answers, correctAnswer);

        assertEquals("Question{query='What is 1 + 1', correctAnswer=3, answers=[0, 3, 5, 2]}", question.toString());

    }


}
