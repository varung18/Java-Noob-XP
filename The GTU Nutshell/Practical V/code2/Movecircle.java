package com.code2.MoveCircle;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


public class Movecircle extends Application {
    @Override
    public void start(Stage stage)  {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CircleMove.fxml"));
            Scene scene = new Scene(loader.load());
            stage.setTitle("Move using arrow keys!");
            CircleController  circleController = loader.getController();

            scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
                @Override
                public void handle(KeyEvent event){
                    switch (event.getCode()){
                        case UP:
                            circleController.up();
                            break;
                        case DOWN:
                            circleController.down();
                            break;
                        case LEFT:
                            circleController.left();
                            break;
                        case RIGHT:
                            circleController.right();
                            break;

                    }
                }
            });
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