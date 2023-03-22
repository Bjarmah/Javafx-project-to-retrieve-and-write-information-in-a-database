package com.class_project_9.class_project_9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class LoggedinController implements Initializable {

    @FXML
    private Button btn_Logout;

    @FXML
    private Label lblSalary;

    @FXML
    private Label lblTxt;

    @FXML
    private Label lblTxt1;

    @FXML
    private Label lblTxt2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    void btn_Logout_(ActionEvent event) {

    }

    void userUserInfo (String username, String Salary){
        lblTxt2.setText("Welcome "+ username);
        lblTxt2.setText("Your salary is "+ Salary);
    }






}
