module com.example.torinopizzaproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.torinopizzaproject to javafx.fxml;
    exports com.example.torinopizzaproject;
}