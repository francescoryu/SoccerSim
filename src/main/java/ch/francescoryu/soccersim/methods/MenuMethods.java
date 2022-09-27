package ch.francescoryu.soccersim.methods;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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

    public void gameTimer(Label label) {
        Thread thread = new Thread();
        for (int i = 0; i < 91; i++) {
            try {
                thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            label.setText(i + " Mins played");
        }
    }
}
