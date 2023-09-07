package com.code3.MoveCircle;

import javafx.fxml.FXML;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class CircleController {

    @FXML
    private Circle myCircle;

    public void makered(){
        myCircle.setFill(Paint.valueOf("RED"));
    }
    public void makeblue(){
        myCircle.setFill(Paint.valueOf("BLUE"));
    }
}
