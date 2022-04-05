package org.example;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainWindowController implements Initializable {
    @FXML
    private TextField regex;

    @FXML
    private TextArea text;

    @FXML
    private TextField result;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    private void onCheckClicked() {
        Pattern pattern = Pattern.compile(regex.getText());
        Matcher matcher = pattern.matcher(text.getText());
        if (matcher.find()) {
            result.setText("OK");
        }
        else {
            result.setText("NG");
        }
    }
}
