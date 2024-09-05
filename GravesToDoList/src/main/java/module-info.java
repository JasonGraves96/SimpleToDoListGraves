module com.example.gravestodolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gravestodolist to javafx.fxml;
    exports com.example.gravestodolist;
}