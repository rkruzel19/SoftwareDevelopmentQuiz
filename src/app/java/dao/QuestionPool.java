package app.java.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionPool {

    private static List<Question> questions = new ArrayList<>(Arrays.asList(
            new Question("Amy's Birthday", Arrays.asList("02/21", "12/04", "09/01", "08/08"), "09/01"),
            new Question("Amy's first pet?", Arrays.asList("Bruno", "Rocky", "Suki", "Goldy"), "Bruno"),
            new Question("Amy's favorite color?", Arrays.asList("pink", "yellow", "red", "blue"), "blue"),
            new Question("Where am I from?", Arrays.asList("Philly", "Florida", "Englewood", "Delaware"), "Philly"),
            new Question("My favorite sport?", Arrays.asList("soccer", "hockey", "football", "baseball"), "hockey"),
            new Question("Brennan's favorite youtube channel?", Arrays.asList("NetNinja", "ShareTheLove", "TheNewBoston", "SlimeBabies"), "ShareTheLove"),
            new Question("Mya's favorite animal?", Arrays.asList("bunny", "dog", "cat", "unicorn"), "unicorn"),
            new Question("Mya's favorite food?", Arrays.asList("Spaghetti", "Chips", "Candy", "Ice cream"), "Candy"),
            new Question("Where are we moving?", Arrays.asList("Colorado", "Las Vegas", "California", "Delaware"), "Colorado"),
            new Question("32 x 6 = ?", Arrays.asList("190", "192", "202", "195"), "192")
    ));

//    public static void loadQuestionPool(){
//        String q1 = "Amy's Birthday?";
//        List<String> options1 = new ArrayList<>(Arrays.asList("02/21", "12/04", "09/01", "08/08"));
//        String answer1 = "09/01";
//        questions.add(new Question(q1, options1, answer1));
//
//
//        String q2 = "Amy's first pet?";
//        List<String> options2 = new ArrayList<>(Arrays.asList("Bruno", "Rocky", "Suki", "Goldy"));
//        String answer2 = "Bruno";
//        questions.add(new Question(q2, options2, answer2));
//
//
//        String q3 = "Where am I from?";
//        List<String> options3 = new ArrayList<>(Arrays.asList("Philly", "Florida", "Englewood", "Delaware"));
//        String answer3 = "Philly";
//        questions.add(new Question(q3, options3, answer3));
//
//
//        String q4 = "Amy's favorite color?";
//        List<String> options4 = new ArrayList<>(Arrays.asList("pink", "yellow", "red", "blue"));
//        String answer4 = "blue";
//        questions.add(new Question(q4, options4, answer4));
//
//
//        String q5 = "My favorite sport?";
//        List<String> options5 = new ArrayList<>(Arrays.asList("soccer", "hockey", "football", "baseball"));
//        String answer5 = "hockey";
//        questions.add(new Question(q5, options5, answer5));
//
//
//        String q6 = "Brennan's favorite youtube channel?";
//        List<String> options6 = new ArrayList<>(Arrays.asList("NetNinja", "ShareTheLove", "TheNewBoston", "SlimeBabies"));
//        String answer6 = "ShareTheLove";
//        questions.add(new Question(q6, options6, answer6));
//
//
//        String q7 = "Mya's favorite animal?";
//        List<String> options7 = new ArrayList<>(Arrays.asList("bunny", "dog", "cat", "unicorn"));
//        String answer7 = "unicorn";
//        questions.add(new Question(q7, options7, answer7));
//
//
//        String q8 = "Mya's favorite food?";
//        List<String> options8 = new ArrayList<>(Arrays.asList("Spaghetti", "Chips", "Candy", "Ice cream"));
//        String answer8 = "Candy";
//        questions.add(new Question(q8, options8, answer8));
//
//
//        String q9 = "Where are we moving?";
//        List<String> options9 = new ArrayList<>(Arrays.asList("Colorado", "Las Vegas", "California", "Delaware"));
//        String answer9 = "Colorado";
//        questions.add(new Question(q9, options9, answer9));
//
//
//        String q10 = "32 x 6 = ?";
//        List<String> options10 = new ArrayList<>(Arrays.asList("190", "192", "202", "195"));
//        String answer10 = "192";
//        questions.add(new Question(q10, options10, answer10));
//    }


    public static List<Question> getQuestions() {
        return questions;
    }

//    public static void setQuestions(List<Question> questions) {
//        questions = questions;
//    }
}
