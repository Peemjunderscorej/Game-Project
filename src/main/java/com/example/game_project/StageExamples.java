package com.example.game_project;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
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

        //StackPane
        /*Button btn = new Button("Hello world");
        StackPane root = new StackPane();
        root.getChildren().add(btn);*/


        //FlowPlane
        FlowPane root = new FlowPane();
        root.setPadding(new Insets(5));
        root.setHgap(25);
        root.setVgap(25);

        Button exitButton = new Button(" Exit ");
        exitButton.setPrefWidth(70);
        Button showButton = new Button(" Show ");
        showButton.setPrefWidth(70);
        TextField text = new TextField(" This is a text field.");
        text.setPrefWidth(250);

        root.getChildren().addAll(exitButton,showButton,text);










        //setPrimaryStage
        primaryStage.setTitle("JavaFX App");
        Scene scene = new Scene(root,300,250);
        primaryStage.setScene(scene);
       //primaryStage.setFullScreen(true);

        //setSTAGE
        Stage stage = new Stage();
        stage.setTitle("Main Stage");

        //stage.initModality(Modality.APPLICATION_MODAL);
        stage.initModality(Modality.WINDOW_MODAL);
        //stage.initModality(Modality.NONE);

        stage.initOwner(primaryStage);

        //stage.initStyle(StageStyle.DECORATED);
        //stage.initStyle(StageStyle.UNDECORATED);
        //stage.initStyle(StageStyle.TRANSPARENT);
        //stage.initStyle(StageStyle.UNIFIED);
        stage.initStyle(StageStyle.UTILITY);

        //showStage
        primaryStage.show();
        stage.showAndWait();

    }
}
