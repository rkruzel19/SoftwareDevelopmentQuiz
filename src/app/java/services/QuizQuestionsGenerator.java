package app.java.services;

import app.java.dao.Question;
import app.java.dao.QuestionPool;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuizQuestionsGenerator {

    public static List<Question> generateQuestionList(int numberOfQs){
        List<Question> questionList = new ArrayList<>();
        for(int i = 1; i <= numberOfQs; i++){
            int questionId = new Random().nextInt(QuestionPool.getQuestions().size());
            Question question = QuestionPool.getQuestions().get(questionId);
            while (questionList.contains(question)){
                questionId = new Random().nextInt(QuestionPool.getQuestions().size());
                question = QuestionPool.getQuestions().get(questionId);
            }
            questionList.add(question);
        }
        return questionList;
    }

}
