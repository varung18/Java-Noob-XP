package com.code2.MoveCircle;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class CircleController {

    @FXML
    private Circle myCircle;
    private double X;
    private double Y;

    public void up(){
        myCircle.setCenterY(Y-=5);
    }
    public void down(){
        myCircle.setCenterY(Y+=5);
    }
    public void left(){

        myCircle.setCenterX(X-=5);
    }
    public void right(){
        myCircle.setCenterX(X+=5);
    }

}