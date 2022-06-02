package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    public Button btnMain;
    int clickCounter = 0;

    @FXML
    public void onBtnAction(ActionEvent actionEvent) {
        System.out.println("Klikniecie nr " + ++clickCounter);
    }
}