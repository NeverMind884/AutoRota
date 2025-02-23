package com.example.autorota;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button exitButton;
    @FXML
    private Label loginStatus;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private TextField uName;
    @FXML
    private TextField pWord;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File brandingFile = new File("images/calendar.png");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);
    }

    public void loginButtonOnAction(ActionEvent event) {
        if(uName.getText().isBlank() == false && pWord.getText().isBlank() == false) {
            validation();
        }else {
            loginStatus.setText("Please enter username and password");
        }
    }

    public void validation() {

    }
   public void exitButtonClicked(ActionEvent event) {
       Stage stage = (Stage) exitButton.getScene().getWindow();
       stage.close();
   }
}