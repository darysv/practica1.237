package ru.bolshakova.bolshakova_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField STextField;

    @FXML
    private TextField TTextField;

    @FXML
    private TextField V1TextField;

    @FXML
    private TextField V2TextField;

    @FXML
    private Button calculateButton;

    @FXML
    private Label rsultLabel;

    @FXML
    void calculateButtonOnAction(ActionEvent event) {
        double v1 = Double.parseDouble(V1TextField.getText().toString());
        double v2 = Double.parseDouble(V2TextField.getText().toString());
        double s = Double.parseDouble(STextField.getText().toString());
        double t = Double.parseDouble(TTextField.getText().toString());

        if (v1 < 0 || v2 < 0 || s < 0 || t < 0) {
            rsultLabel.setText("Скорости, расстояние и время должны быть неотрицательными.");
        }

        double distance = s + t * (v1 + v2);
        rsultLabel.setText("Расстояние через " + t + " часов: " + String.format("%.2f", distance) + " км");


    }

}
