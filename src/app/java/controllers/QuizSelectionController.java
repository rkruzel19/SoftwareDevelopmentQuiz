package app.java.controllers;

import app.java.dao.Question;
import app.java.dao.QuestionPool;
import app.java.services.SceneBuilder;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class QuizSelectionController implements Initializable {

    @FXML
    public List<Question> quizQuestions;
    @FXML
    public Button beginQuizButton;
    @FXML
    public Button homeButton;
    @FXML
    public TextField numberOfQuestions;
    public QuestionPool questionPool;



    SceneBuilder sb;

    public void beginQuiz() throws Exception{
        int amount = receiveInput();
        System.out.println(questionPool.getQuestions().get(amount));
        sb.setNewScene(beginQuizButton, "quiz");
    }

    public void returnHome() throws Exception{
        sb.setNewScene(beginQuizButton, "welcome");
    }

    public int receiveInput(){
        return Integer.parseInt(numberOfQuestions.getText());
    }

    public void populateQuizQuestions(int numberOfQuestions){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        questionPool = new QuestionPool();
        sb = new SceneBuilder();
        quizQuestions = new ArrayList<>();
    }
}
