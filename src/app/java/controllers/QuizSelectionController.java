package app.java.controllers;

import app.java.dao.Question;
import app.java.dao.QuestionPool;
import app.java.services.QuizQuestionsGenerator;
import app.java.services.SceneBuilder;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class QuizSelectionController extends Controller implements Initializable {

    @FXML
    public List<Question> quizQuestions;
    @FXML
    public Button beginQuizButton;
    @FXML
    public Button homeButton;
    @FXML
    public TextField numberOfQuestions;
    @FXML
    public Label totalQsInDatabase;
    SceneBuilder sb;

    public void beginQuiz() throws Exception{
        int amount = receiveInput();
        populateQuizQuestions(amount);
        sb.setNewSceneWithParameters(beginQuizButton, "quiz", quizQuestions);
    }

    public void returnHome() throws Exception{
        sb.setNewScene(beginQuizButton, "welcome");
    }

    public int receiveInput(){
        return Integer.parseInt(numberOfQuestions.getText());
    }

    public void populateQuizQuestions(int numberOfQuestions){
        quizQuestions = QuizQuestionsGenerator.generateQuestionList(numberOfQuestions);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sb = new SceneBuilder();
        quizQuestions = new ArrayList<>();
        totalQsInDatabase.setText(QuestionPool.getQuestions().size() + " questions available");
    }

    @Override
    public void initData(Object parameter) {

    }
}
