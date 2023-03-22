package com.class_project_9.class_project_9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ClassDataBase extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ClassDataBase.class.getResource("Login.fxml"));
        FXMLLoader fxmlLoader2 = new FXMLLoader(ClassDataBase.class.getResource("Signup_.fxml"));

        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        }

    public static void main(String[] args) {
        launch();
    }
}