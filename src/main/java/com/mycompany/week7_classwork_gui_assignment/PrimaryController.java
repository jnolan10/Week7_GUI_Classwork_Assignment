package com.mycompany.week7_classwork_gui_assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PrimaryController {
    
    @FXML
    private int counter = 0;
    
    @FXML 
    private Image img1;
    
    @FXML
    private Image img2;
    
    @FXML
    private ImageView ImgView;
    
    @FXML
    private Label countLabel;

    @FXML
    private Button rotateBtn;

    @FXML
    private Button showImg1Btn;

    @FXML
    private Button showImg2Btn;
    
    @FXML
    void showImg2Btn(ActionEvent event) throws FileNotFoundException {
        img2 = new Image(new FileInputStream("C:\\Users\\jonat\\OneDrive\\Desktop\\Images\\cw.jpg"));
        ImgView.setImage(img2);
        counter++;
        countLabel.setText(""+counter);
    }
    
    @FXML
    void showImg1Btn(ActionEvent event) throws FileNotFoundException {
        img1 = new Image(new FileInputStream("C:\\Users\\jonat\\OneDrive\\Desktop\\Images\\lt.jpg"));
        ImgView.setImage(img1);
        counter++;
        countLabel.setText(""+counter);
    }
    
    @FXML
    void rotateBtnAction(ActionEvent event) throws IOException {
       ImgView.setRotate(ImgView.getRotate() + 90);
       counter++;
       countLabel.setText(""+counter);
    }
    
     @FXML
    private void showPrimary() throws IOException {
        App.setRoot("primary");
    }
    
}
