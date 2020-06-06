package app.java.controllers;

import app.java.services.SceneBuilder;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class EndOfQuizController extends Controller implements Initializable {

    @FXML
    Label userScore;
    @FXML
    Button homeButton;

    SceneBuilder sb;


    public void goHome() throws Exception{
        sb.setNewScene(homeButton, "welcome");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sb = new SceneBuilder();
    }

    @Override
    public void initData(Object parameter) {
        Label label = (Label) parameter;
        this.userScore.setText(label.getText());
    }
}
