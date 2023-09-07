package com.code3.MoveCircle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class CircleColor extends Application {
    @Override
    public void start(Stage stage)  {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CircleColor.fxml"));
            Scene scene = new Scene(loader.load());
            stage.setTitle("Press mouse ot make it Red");
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