package ch.francescoryu.soccersim;

import ch.francescoryu.soccersim.methods.MenuMethods;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

import java.util.Collection;
import java.util.Timer;

/**
 * @author Francesco Ryu
 * @date 26.09.2022 (European Date Format)
 * @version 0.1
 */

public class SoccerSim extends Application {
    MenuMethods menuMethods = new MenuMethods();
    @Override
    public void start(Stage stage) throws InterruptedException {
        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color: linear-gradient(to bottom, #ffaf3d, #7b00ff);");

        Label welcomeLabel = new Label("SoccerSim");
        welcomeLabel.setStyle("-fx-font-size: 40; -fx-font-family: 'Times New Roman'");

        Button scoreButton = new Button("Score");
        menuMethods.setButtonStyle(scoreButton);

        GridPane gridPane = new GridPane();
        gridPane.add(scoreButton, 0, 0);

        VBox buttonBox = new VBox(gridPane);
        buttonBox.setStyle("-fx-border-color: black; -fx-border-insets: 10; -fx-padding: 2");
        borderPane.setLeft(buttonBox);

        HBox welcomeLabelBox = new HBox();
        welcomeLabelBox.setStyle("-fx-alignment: center; -fx-border-color: black");
        welcomeLabelBox.getChildren().addAll(welcomeLabel);
        borderPane.setTop(welcomeLabelBox);

        Label team1Label = new Label("Team 1");
        team1Label.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-size: 30");

        TextField team1TextField = new TextField();
        team1TextField.setStyle("-fx-font-size: 15");
        team1TextField.setPrefColumnCount(15);

        Button clearButton = new Button("Clear");
        menuMethods.setButtonStyle(clearButton);

        VBox team1Box = new VBox();
        team1Box.setSpacing(15);
        team1Box.setAlignment(Pos.TOP_CENTER);
        team1Box.setStyle("-fx-border-color: black; -fx-padding: 10");
        team1Box.getChildren().addAll(team1Label, team1TextField, clearButton);

        Label team2Label = new Label("Team 2");
        team2Label.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-size: 30");

        TextField team2TextField = new TextField();
        team2TextField.setStyle("-fx-font-size: 15");
        team2TextField.setPrefColumnCount(15);

        Button startButton = new Button("Start");
        menuMethods.setButtonStyle(startButton);

        VBox team2Box = new VBox();
        team2Box.setSpacing(15);
        team2Box.setAlignment(Pos.TOP_CENTER);
        team2Box.setStyle("-fx-border-color: black; -fx-padding: 10");
        team2Box.getChildren().addAll(team2Label, team2TextField, startButton);

        clearButton.setOnAction(actionEvent -> {
            menuMethods.deleteInputFromTextField(team1TextField, team2TextField);
        });

        //------------------------------------------------------------------------------------------------------------



        //------------------------------------------------------------------------------------------------------------

        BorderPane centerPane = new BorderPane();
        centerPane.setStyle("-fx-border-color: black; " +
                "-fx-border-insets: 10; " +
                "-fx-padding: 10");
        centerPane.setLeft(team1Box);
        centerPane.setRight(team2Box);
        borderPane.setCenter(centerPane);

        Scene scene = new Scene(borderPane, 700, 500);
        stage.setTitle("SoccerSim");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        startButton.setOnAction(actionEvent ->  {
            team1Box.setVisible(false);
            team2Box.setVisible(false);

            try {
                menuMethods.startGame(centerPane);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
    }
}