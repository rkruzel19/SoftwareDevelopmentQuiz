package app.java.services;

import app.java.dao.Question;
import app.java.dao.QuestionPool;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuizQuestionsGenerator {

    public static List<Question> generateEntireQuestionList(){
        return generateXQuestions(QuestionPool.getQuestions().size());
    }

    public static List<Question> generateXQuestions(int numberOfQs){
        List<Question> questionList = new ArrayList<>();
        for(int i = 1; i <= numberOfQs; i++){
            Question question = getRandomQuestion();
            while (duplicateQuestion(questionList, question)){
                question = getRandomQuestion();
            }
            questionList.add(question);
        }
        return questionList;
    }

    public static Question getRandomQuestion(){
        int questionId = new Random().nextInt(QuestionPool.getQuestions().size());
        return QuestionPool.getQuestions().get(questionId);
    }

    public static boolean duplicateQuestion(List<Question> questions, Question question){
       return questions.contains(question);
    }

}
