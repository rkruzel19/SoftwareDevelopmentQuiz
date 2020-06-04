package app.java.services;

import app.java.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class SceneBuilder {

    public void setNewScene(Button button, String file) throws Exception {
        Stage stage = makeStage(button);
        stage.setScene(makeScene(file));
        stage.show();
    }

    public Stage makeStage(Button button){
        return (Stage)button.getScene().getWindow();
    }

    public Scene makeScene(String file) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../../resources/view/" + file + ".fxml"));
        return setStyleSheet(new Scene(root, 1200, 800), file);
    }

    public Scene setStyleSheet(Scene scene, String file){
        scene.getStylesheets().add(Main .class.getResource("../resources/css/" + file + ".css").toExternalForm());
        return scene;
    }


}
