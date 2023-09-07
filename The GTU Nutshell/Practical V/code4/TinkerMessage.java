package com.code4.MoveCircle;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


public class TinkerMessage extends Application {
    @Override
    public void start(Stage stage)  {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CircleMove.fxml"));
            Scene scene = new Scene(loader.load());
            stage.setTitle("Move using arrow keys and Radio button for colors !");

            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}