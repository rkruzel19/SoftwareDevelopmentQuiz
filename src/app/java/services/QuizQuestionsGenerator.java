package app.java.services;

import app.java.dao.Question;
import app.java.dao.QuestionPool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class QuizQuestionsGenerator {

    public static List<Question> generateQuestionList(int numberOfQs){
        List<Question> questionList = new ArrayList<>();
        for(int i = 1; i <= numberOfQs; i++){
            int questionId = new Random().nextInt(10);
            questionList.add(QuestionPool.getQuestions().get(questionId));
        }
        return questionList;
    }

}
