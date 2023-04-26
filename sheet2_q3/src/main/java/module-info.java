module com.example.sheet2_q3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sheet2_q3 to javafx.fxml;
    exports com.example.sheet2_q3;
}