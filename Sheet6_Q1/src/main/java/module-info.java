module com.example.sheet6_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sheet6_javafx to javafx.fxml;
    exports com.example.sheet6_javafx;
}