package com.qiangke.javafx.example;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class AnchorPaneController {

    @FXML
    private Text textId;

    @FXML
    void printHelloWord(MouseEvent event) {
        textId.setText("Hello World !");
    }
}