package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    String memory;
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;


    public void onActionButton(ActionEvent actionEvent) {
        memory=textField.getText();
        textArea.appendText(memory);
        textField.setText("");
        textField.requestFocus();
    }
}
