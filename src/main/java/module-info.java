module com.example.game_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.game_project to javafx.fxml;
    exports com.example.game_project;
}