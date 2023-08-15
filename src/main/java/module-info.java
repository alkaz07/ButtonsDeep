module com.example.buttonsdeep {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.buttonsdeep to javafx.fxml;
    exports com.example.buttonsdeep;
}