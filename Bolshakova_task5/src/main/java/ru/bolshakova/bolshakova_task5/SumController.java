package ru.bolshakova.bolshakova_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button calculateButton;

    @FXML
    private Label resultButton;

    @FXML
    private TextField xTextField;

    @FXML
    private TextField yTextField;

    @FXML
    void calculateButtonOnAction(ActionEvent event) {
        double x = Double.parseDouble(xTextField.getText());
        double y = Double.parseDouble(yTextField.getText());

        double a = x + y;
        double b = x * x + y * y;


        double p = Math.pow(a + b, 2) + a * Math.cos(a + b) + Math.sqrt(b) + b;
        resultButton.setText("Результат: " + String.format("%.2f", p));
            }
        }


