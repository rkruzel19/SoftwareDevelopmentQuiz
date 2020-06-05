package app.java.services;

import app.java.Main;
import app.java.dao.Question;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.util.List;

public class SceneBuilder {

    public void setNewScene(Button button, String file) throws Exception {
        Stage stage = (Stage)button.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../../resources/view/" + file + ".fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 1200, 800);
        scene.getStylesheets().add(Main .class.getResource("../resources/css/" + file + ".css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }


}
