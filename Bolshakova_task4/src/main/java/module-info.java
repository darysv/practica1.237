module ru.bolshakova.bolshakova_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bolshakova.bolshakova_task4 to javafx.fxml;
    exports ru.bolshakova.bolshakova_task4;
}