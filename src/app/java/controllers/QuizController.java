package app.java.controllers;

import app.java.services.SceneBuilder;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;

public class QuizController implements Initializable {

    @FXML
    Button subButton;
    SceneBuilder sb;

    public void backToWelcome() throws Exception{
        sb.setNewScene(subButton, "welcome");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sb = new SceneBuilder();
    }
}
