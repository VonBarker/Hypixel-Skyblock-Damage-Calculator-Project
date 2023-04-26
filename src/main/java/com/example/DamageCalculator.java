package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DamageCalculator extends Application  {


    @Override
    public void start(Stage stage) {

        //Input Labels
        Label damageInputLabel = new Label("Damage:");
        Label strengthInputLabel = new Label("Strength:");
        Label critDamageInputLabel = new Label("Crit Damage:");

        //Inputs
        //Damage
        Spinner<Integer> damageInputSpinner = new Spinner<Integer>();
        SpinnerValueFactory<Integer> damageInputValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 9999);
        damageInputSpinner.setValueFactory(damageInputValueFactory);
        damageInputSpinner.setEditable(true);
        //Strength
        Spinner<Integer> strengthInputSpinner = new Spinner<Integer>();
        SpinnerValueFactory<Integer> strengthInputValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 9999);
        strengthInputSpinner.setValueFactory(strengthInputValueFactory);
        strengthInputSpinner.setEditable(true);
        //Crit Damage
        Spinner<Integer> critDamageInputSpinner = new Spinner<Integer>();
        SpinnerValueFactory<Integer> critDamageInputValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 9999);
        critDamageInputSpinner.setValueFactory(critDamageInputValueFactory);
        critDamageInputSpinner.setEditable(true);

        //Ouput Labels
        Label damageOutputLabel = new Label("Damage:");
        Label critDamageOutputLabel = new Label("Critical Hit Damage:");
        
        //Outputs
        Label damageOutputValueLabel = new Label("");
        Label critDamageOutputValueLabel = new Label("");

        //Button
        Button calculateButton = new Button("Calculate");
        calculateButton.setOnAction(action -> {
            //Get Inputs
            double damage = damageInputSpinner.getValue();
            double strength = strengthInputSpinner.getValue();
            double critDamage = critDamageInputSpinner.getValue();
            
            //Results
            double damageOutput = ((damage + 5) * (1 + strength/100));
            double critDamageOutput = ((damage + 5) * (1 + strength/100)) * (1 + critDamage/100);
            String damageOutputString = "" + damageOutput;
            String critDamageOutputString = "" + critDamageOutput;
            //Display
            damageOutputValueLabel.setText(damageOutputString);
            critDamageOutputValueLabel.setText(critDamageOutputString);
        });

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
        gridPane.add(calculateButton, 0, 3);
        gridPane.add(damageOutputLabel, 2, 0);
        gridPane.add(critDamageOutputLabel, 2, 2);
        gridPane.add(damageOutputValueLabel, 2, 1);
        gridPane.add(critDamageOutputValueLabel, 2, 3);

        Scene scene = new Scene(gridPane);

        stage.setTitle("Hypixel Skyblock Damage Calculator");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
