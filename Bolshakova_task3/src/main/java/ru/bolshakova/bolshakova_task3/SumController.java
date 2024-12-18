package ru.bolshakova.bolshakova_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField ACBCTextField;

    @FXML
    private TextField ACTextField;

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BCTextField;

    @FXML
    private TextField BTextField;

    @FXML
    private TextField CTextField;

    @FXML
    private Button ResultButton;

    @FXML
    void ResultButtonOnAction(ActionEvent event) {
        double a = Double.parseDouble(ATextField.getText().toString());
        double b = Double.parseDouble(BTextField.getText().toString());
        double c = Double.parseDouble(CTextField.getText().toString());
        double ac = Math.abs(a-c);
        double bc = Math.abs(b-c);
        double sum = ac + bc;
        ACBCTextField.setText(""+sum);
        ACTextField.setText(""+ac);
        BCTextField.setText(""+bc);

    }

}
