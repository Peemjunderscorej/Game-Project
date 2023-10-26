package com.example.game_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Create Variable
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        //Set stage
        stage.setTitle("Halloween");
        stage.setScene(scene);

        //Set position
        stage.setX(0);
        stage.setY(0);
        stage.setWidth(1920);
        stage.setHeight(1080);

        //Output
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}