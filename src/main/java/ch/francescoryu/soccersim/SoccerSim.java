package ch.francescoryu.soccersim;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

/**
 * @author Francesco Ryu
 * @date 26.09.2022 (European Date Format)
 * @version 0.1
 */

public class SoccerSim extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color: linear-gradient(to bottom, #ffaf3d, #7b00ff);");

        Label welcomeLabel = new Label("SoccerSim");
        welcomeLabel.setStyle("-fx-font-size: 40; -fx-font-family: 'Times New Roman'");



        GridPane gridPane = new GridPane();

        VBox buttonBox = new VBox(gridPane);
        buttonBox.setStyle("-fx-border-color: black");
        borderPane.setLeft(buttonBox);

        HBox welcomeLabelBox = new HBox();
        welcomeLabelBox.setStyle("-fx-alignment: center; -fx-border-color: black");
        welcomeLabelBox.getChildren().addAll(welcomeLabel);
        borderPane.setTop(welcomeLabelBox);

        VBox team1Box = new VBox();

        HBox centerBox = new HBox();
        centerBox.setStyle("-fx-border-color: black; -fx-border-insets: 100");
        centerBox.getChildren().add(team1Box);
        borderPane.setCenter(centerBox);

        Scene scene = new Scene(borderPane, 700, 500);
        stage.setTitle("SoccerSim");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}