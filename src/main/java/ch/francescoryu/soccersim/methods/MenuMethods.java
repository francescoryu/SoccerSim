package ch.francescoryu.soccersim.methods;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

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

    public void gameTimer(Label label, Button button) {

    }

    public void startGame(BorderPane borderPane) {
        Button button = new Button("start");
        Label label = new Label();

        button.setOnAction(e -> new Thread(() -> {
            for (int i = 0; i < 91; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                label.setText(i + " Mins Played");
                System.out.println(i);
            }
        }));

        HBox timeBox = new HBox();
        timeBox.getChildren().addAll(button, label);
        borderPane.setTop(timeBox);
    }
}
