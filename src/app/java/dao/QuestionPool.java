package app.java.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionPool {

    private List<Question> questions = new ArrayList<>();

    public QuestionPool(){
        String q1 = "Amy's Birthday?";
        List<String> options1 = new ArrayList<>(Arrays.asList("02/21", "12/04", "09/01", "08/08"));
        int answer1 = 2;
        questions.add(new Question(q1, options1, answer1));


        String q2 = "Amy's first pet?";
        List<String> options2 = new ArrayList<>(Arrays.asList("Bruno", "Rocky", "Suki", "Goldy"));
        int answer2 = 0;
        questions.add(new Question(q2, options2, answer2));


        String q3 = "Where am I from?";
        List<String> options3 = new ArrayList<>(Arrays.asList("Philly", "Florida", "Englewood", "Delaware"));
        int answer3 = 0;
        questions.add(new Question(q3, options3, answer3));


        String q4 = "Amy's favorite color?";
        List<String> options4 = new ArrayList<>(Arrays.asList("pink", "yellow", "red", "blue"));
        int answer4 = 3;
        questions.add(new Question(q4, options4, answer4));


        String q5 = "My favorite sport?";
        List<String> options5 = new ArrayList<>(Arrays.asList("soccer", "hockey", "football", "baseball"));
        int answer5 = 1;
        questions.add(new Question(q5, options5, answer5));


        String q6 = "Brennan's favorite youtube channel?";
        List<String> options6 = new ArrayList<>(Arrays.asList("NetNinja", "ShareTheLove", "TheNewBoston", "SlimeBabies"));
        int answer6 = 1;
        questions.add(new Question(q6, options6, answer6));


        String q7 = "Mya's favorite animal?";
        List<String> options7 = new ArrayList<>(Arrays.asList("bunny", "dog", "cat", "unicorn"));
        int answer7 = 3;
        questions.add(new Question(q7, options7, answer7));


        String q8 = "Mya's favorite food?";
        List<String> options8 = new ArrayList<>(Arrays.asList("Spaghetti", "Chips", "Candy", "Ice cream"));
        int answer8 = 2;
        questions.add(new Question(q8, options8, answer8));


        String q9 = "Where are we moving?";
        List<String> options9 = new ArrayList<>(Arrays.asList("Colorado", "Las Vegas", "California", "Delaware"));
        int answer9 = 0;
        questions.add(new Question(q9, options9, answer9));


        String q10 = "32 x 6 = ?";
        List<String> options10 = new ArrayList<>(Arrays.asList("190", "192", "202", "195"));
        int answer10 = 2;
        questions.add(new Question(q10, options10, answer10));
    }


    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
