package app.java.controllers;

import app.java.Main;
import app.java.dao.Question;
import app.java.dao.QuestionPool;
import app.java.services.QuizQuestionsGenerator;
import app.java.services.SceneBuilder;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    @FXML
    public Label totalQsInDatabase;
    public QuestionPool questionPool;
    SceneBuilder sb;

    public void beginQuiz() throws Exception{
        int amount = receiveInput();

        populateQuizQuestions(amount);
        quizQuestions.forEach(System.out::println);
//        sb.setNewScene(beginQuizButton, "quiz");

        // Not using SceneBuilder to be able to pass quizList through
        Stage stage = (Stage)beginQuizButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../../resources/view/quiz.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 1200, 800);

        // Access QuizController and call method
        QuizController quizController = loader.getController();
        quizController.initData(quizQuestions);

        scene.getStylesheets().add(Main.class.getResource("../resources/css/quiz.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
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
        questionPool = new QuestionPool();
        sb = new SceneBuilder();
        quizQuestions = new ArrayList<>();
        totalQsInDatabase.setText(QuestionPool.getQuestions().size() + " questions available");
    }
}
