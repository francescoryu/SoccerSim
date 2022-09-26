package ch.francescoryu.soccersim;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SoccerSim extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane);
        stage.setTitle("HAPIN");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}