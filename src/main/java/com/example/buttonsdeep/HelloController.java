package com.example.buttonsdeep;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    public Label label1;

    @FXML
    Button button1;
    @FXML
    Button button2;

    public void initialize(){
        button2.setOnAction(actionEvent -> label1.setText("первое нажатие на кнопку 2"));

       // button1.setOnAction(new Clicker2(label1));
    }

    @FXML
    protected void onHelloButtonClick() {
        label1.setText("Первое нажатие на кнопку");
        //button1.setOnAction(new Clicker1());
        button1.setOnAction(new Clicker2(label1));
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                label1.setText("это был бы Clicker3, но он анонимный");
            }
        });


    }

}

class Clicker1 implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("работает Clicker1");
    }
}

class Clicker2 implements EventHandler<ActionEvent> {
    public Clicker2(Label l) {
        this.l = l;
    }

    Label l;
    @Override
    public void handle(ActionEvent actionEvent) {
       l.setText("работает Clicker2");
    }
}