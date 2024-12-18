package ru.polkovnikova.bolshakova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button ResultButton;

    @FXML
    private Label resLabel;

    @FXML
    private TextField txtDiameter;

    @FXML
    void ResultButtonOnAction(ActionEvent event) {
        double diameter = Double.parseDouble(txtDiameter.getText().toString());
        double pi = 3.14;
        resLabel.setText("L="+Math.PI*diameter);

    }

}
