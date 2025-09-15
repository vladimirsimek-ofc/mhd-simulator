package com.vladimirsimek.mhd;

import com.vladimirsimek.mhd.logic.locations.LocationState;
import com.vladimirsimek.mhd.logic.locations.Stop;
import com.vladimirsimek.mhd.logic.vehicles.VehicleFactory;
import com.vladimirsimek.mhd.logic.vehicles.VehicleType;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class StopCreatorController {
    public TextField inputField;

    public void onCreateNewStopClick(ActionEvent actionEvent) {
        String stopName = inputField.getText();
        MhdSimulator.mhdLines.getFirst().locations.add(new Stop(stopName));

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("simulation.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("MHD Simulator");
            stage.centerOnScreen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onCancelClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("simulation.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("MHD Simulator");
            stage.centerOnScreen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
