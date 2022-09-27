package ch.francescoryu.soccersim.methods;

import javafx.animation.AnimationTimer;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.util.Timer;

public class MenuMethods {
    public void setButtonStyle(Button button) {
        button.setStyle("-fx-font-family: 'Times New Roman';" +
                "-fx-font-size: 20;" +
                "-fx-pref-height: 40;" +
                "-fx-pref-width: 150;" +
                "-fx-font-family: 'Times New Roman';" +
                "-fx-background-radius: 10;" +
                "-fx-border-color: black;" +
                "-fx-border-radius: 10");
    }

    public void deleteInputFromTextField(TextField textField1, TextField textField2) {
        textField1.setText("");
        textField2.setText("");
    }

    public void startGame(BorderPane borderPane) throws InterruptedException {
        Button button = new Button("TEST");
        Label label = new Label();



        HBox displayBox = new HBox();
        displayBox.getChildren().addAll(button, label);
        borderPane.setTop(displayBox);
    }
}
