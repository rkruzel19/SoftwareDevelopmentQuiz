package app.java.controllers;

import app.java.services.SceneBuilder;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController extends Controller implements Initializable {

    @FXML
    private Button startQuizButton;
    public SceneBuilder sb;

    public void startQuiz() throws Exception{
        sb.setNewScene((Stage)startQuizButton.getScene().getWindow(), "quizSelection");

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sb = new SceneBuilder();
    }

    @Override
    public void initData(Object parameter) {

    }
}
