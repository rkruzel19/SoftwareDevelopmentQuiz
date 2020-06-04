package app.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../resources/view/welcome.fxml"));
        primaryStage.setTitle("Software Developer Quiz");

        Scene welcomePage = new Scene(root, 1200, 800);
        welcomePage.getStylesheets().add(Main.class.getResource("../resources/css/welcome.css").toExternalForm());
        primaryStage.setScene(welcomePage);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
