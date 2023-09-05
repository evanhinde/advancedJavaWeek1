module com.example.advancedjavaweek1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.advancedjavaweek1 to javafx.fxml;
    exports com.example.advancedjavaweek1;
}