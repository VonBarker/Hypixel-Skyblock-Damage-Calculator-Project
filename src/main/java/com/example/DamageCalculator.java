package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.stage.Stage;

public class DamageCalculator extends Application  {


    @Override
    public void start(Stage stage) {

        //Input Labels
        Label damageInputLabel = new Label("Damage:");
        Label strengthInputLabel = new Label("Strength:");
        Label critDamageInputLabel = new Label("Crit Damage:");

        //Inputs
        Spinner damageInputSpinner = new Spinner(0, 9999, 0);
        damageInputSpinner.setEditable(true);
        Spinner strengthInputSpinner = new Spinner(0, 9999, 0);
        damageInputSpinner.setEditable(true);
        Spinner critDamageInputSpinner = new Spinner(0, 9999, 0);
        damageInputSpinner.setEditable(true);

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(400, 150);

        gridPane.setPadding(new Insets(10, 10, 10, 10));

        gridPane.setVgap(5);
        gridPane.setHgap(5);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(damageInputLabel, 0, 0);
        gridPane.add(damageInputSpinner, 1, 0);
        gridPane.add(strengthInputLabel, 0, 1);
        gridPane.add(strengthInputSpinner, 1, 1);
        gridPane.add(critDamageInputLabel, 0, 2);
        gridPane.add(critDamageInputSpinner, 1, 2);

        Scene scene = new Scene(gridPane);

        stage.setTitle("Hypixel Skyblock Damage Calculator");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
