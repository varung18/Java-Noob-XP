package com.code4.MoveCircle;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.paint.Paint;

public class MessageController {

    @FXML
    private Label LabelMessage;
   @FXML
   private RadioButton bblack;
    @FXML
    private RadioButton bred;
    private double X = 100;

    public void black(){
        LabelMessage.setTextFill(Paint.valueOf("BLACK"));
        bred.setSelected(false);
    }
    public void red(){
        LabelMessage.setTextFill(Paint.valueOf("RED"));
        bblack.setSelected(false);
    }
    public void left(){

        LabelMessage.setLayoutX(X-=5);
    }
    public void right(){
        LabelMessage.setLayoutX(X+=5);
    }

}
