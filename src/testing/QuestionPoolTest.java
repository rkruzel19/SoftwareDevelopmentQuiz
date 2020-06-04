package testing;

import app.java.dao.Question;
import app.java.dao.QuestionPool;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuestionPoolTest {

    @Test
    public void questionList(){
        QuestionPool qp = new QuestionPool();
        Question question = qp.getQuestions().get(4);

        assertEquals("", question.toString());

    }

}
