package com.vladimirsimek.mhd;

import com.vladimirsimek.mhd.logic.locations.LocationState;
import com.vladimirsimek.mhd.logic.locations.LocationStates;
import com.vladimirsimek.mhd.logic.vehicles.VehicleFactory;
import com.vladimirsimek.mhd.logic.vehicles.VehicleType;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class BusCreatorController {

    @FXML
    private TextField inputField;

    public void onCreateNewBusClick(ActionEvent actionEvent) {
        String busName = inputField.getText();
        MhdSimulator.mhdLines.getFirst().locations.getFirst().addVehicle(VehicleFactory.createVehicle(VehicleType.BUS, busName));
        MhdSimulator.mhdLines.getFirst().locations.getFirst().setLocationState(LocationStates.OCCUPIED);

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("depot-hud.fxml"));
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
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("depot-hud.fxml"));
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
