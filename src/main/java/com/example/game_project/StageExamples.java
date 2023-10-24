package com.example.game_project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.stage.StageStyle;

import java.io.IOException;

public class StageExamples extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX App");

        VBox vbox = new VBox();
        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);


        Stage stage = new Stage();
        stage.setTitle("Main Stage");

        //stage.initModality(Modality.APPLICATION_MODAL);
        //stage.initModality(Modality.WINDOW_MODAL);
        stage.initModality(Modality.NONE);

        //stage.initOwner(primaryStage);

        //stage.initStyle(StageStyle.DECORATED);
        //stage.initStyle(StageStyle.UNDECORATED);
        //stage.initStyle(StageStyle.TRANSPARENT);
        //stage.initStyle(StageStyle.UNIFIED);
        stage.initStyle(StageStyle.UTILITY);

        primaryStage.show();

        stage.showAndWait();

    }
}
