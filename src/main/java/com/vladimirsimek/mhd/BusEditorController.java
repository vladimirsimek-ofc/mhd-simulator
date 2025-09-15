package com.vladimirsimek.mhd;

import com.vladimirsimek.mhd.logic.locations.LocationState;
import com.vladimirsimek.mhd.logic.locations.LocationStates;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BusEditorController implements Initializable {
    public TextField vehicleName;
    public Label vehicleState;
    public Label gasLevel;
    public Label passengerCount;
    public Button confirmEditingClickButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vehicleName.textProperty().addListener((observable, oldValue, newValue) -> {
            boolean wasEdited = !newValue.isEmpty() &&
                    !newValue.equals(MhdSimulator.mhdLines.getFirst().locations.getFirst().getVehicles().getFirst().getName());
            confirmEditingClickButton.setDisable(!wasEdited);
        });

        vehicleName.setText(MhdSimulator.mhdLines.getFirst().locations.getFirst().getVehicles().getFirst().getName());
        gasLevel.setText("Gas level: " + MhdSimulator.mhdLines.getFirst().locations.getFirst().getVehicles().getFirst().getGasLevel() + "/ 100");
        passengerCount.setText("Passenger count: " + MhdSimulator.mhdLines.getFirst().locations.getFirst().getVehicles().getFirst().getPassengerCount() + "/" + MhdSimulator.mhdLines.getFirst().locations.getFirst().getVehicles().getFirst().getMaxPassengersCount());
        vehicleState.setText("Vehicle state: " + MhdSimulator.mhdLines.getFirst().locations.getFirst().getVehicles().getFirst().getVehicleState());
    }




    public void onConfirmEditingClick(ActionEvent actionEvent) {
        
        boolean wasEdited = !vehicleName.getText().isEmpty() &&
                !vehicleName.getText().equals(MhdSimulator.mhdLines.getFirst().locations.getFirst().getVehicles().getFirst().getName());
        if (wasEdited) {
            MhdSimulator.mhdLines.getFirst().locations.getFirst().getVehicles().getFirst().setName(vehicleName.getText());
        }
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

    public void onReturnWithoutEditingClick(ActionEvent actionEvent) {
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

    public void onDeleteVehicleClick(ActionEvent actionEvent) {
        MhdSimulator.mhdLines.getFirst().locations.getFirst().removeVehicle(MhdSimulator.mhdLines.getFirst().locations.getFirst().getVehicles().getFirst());
        MhdSimulator.mhdLines.getFirst().locations.getFirst().setLocationState(LocationStates.FREE);
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
