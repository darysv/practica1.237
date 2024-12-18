module ru.polkovnikova.bolshakova_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.bolshakova_task2 to javafx.fxml;
    exports ru.polkovnikova.bolshakova_task2;
}