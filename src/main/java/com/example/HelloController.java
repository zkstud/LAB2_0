package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public Button btnMain;
    int clickCounter = 0;
    @FXML
    public TextField txtLicznik;

    @FXML
    public void onBtnAction(ActionEvent actionEvent) {
        txtLicznik.setText("Klikniecie nr " + ++clickCounter);
        if(clickCounter == 1)
            btnMain.setText("I jeszcze raz");
    }
}