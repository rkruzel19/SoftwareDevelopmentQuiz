package app.java.dao;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private String query;
    private int correctAnswer;
    private List<String> answers;

    public Question() {
        query = "";
        correctAnswer = 0;
        answers = new ArrayList<>();
    }

    public Question(String query, List<String> answers, int correctAnswer) {
        this.query = query;
        this.correctAnswer = correctAnswer;
        this.answers = answers;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "query='" + query + '\'' +
                ", correctAnswer=" + correctAnswer +
                ", answers=" + answers +
                '}';
    }
}
