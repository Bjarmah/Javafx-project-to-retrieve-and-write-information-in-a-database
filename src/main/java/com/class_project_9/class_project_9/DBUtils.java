package com.class_project_9.class_project_9;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DBUtils {
 static void SceneChange(ActionEvent Event, String FxmlFile, String Username, String Title, String Salary){
     Parent root = null;

     //THIS IF STATEMENT IS PLACED HERE TO RUN CODES FOR WHEN THE USER HAS SIGNED IN AND NOT SIGNED OUT
     //SINCE IF THE USERNAME , SALARY IS NULL, IT MEANS THEY HAVE YET TO SIGN UP, AND WILL GO TO THE
     // SIGNUP SCENE INSTEAD
     // THEREFORE THE CODES HERE ARE FOR WHEN THE USERS ARE LOGGING IN
     if (Username != null && Salary != null) {
         try {
             FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource(FxmlFile));
             root = loader.load();
             LoggedinController loggedinController = loader.getController();
             loggedinController.userUserInfo(Username, Salary);
         } catch (IOException e) {
             System.out.println("Sorry but the fxml file does not exist");
             System.out.println(e.getMessage());
         }
     }else {
         try {
             FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource(FxmlFile));
             root = loader.load();
         } catch (IOException e) {
             System.out.println("Sorry but the fxml file does not exist");
             System.out.println(e.getMessage());
         }

     }
     Stage stage = new Stage();
     stage.setScene(new Scene(root));
     stage.setResizable(false);
     stage.setTitle("ABC");
     stage.show();
 }

}
