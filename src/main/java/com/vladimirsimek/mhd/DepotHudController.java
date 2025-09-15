package com.vladimirsimek.mhd;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DepotHudController implements Initializable {


    public Label depotName;
    public Label depotCapacity;
    public Label welcomeText;
    public Button createNewBusButton;
    public Button vehicleOne;
    public Label vehicleText;
    public Label locationState;


    /**
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        depotName.setText(MhdSimulator.mhdLines.getFirst().locations.getFirst().getName());
        depotCapacity.setText("Capacity: " + MhdSimulator.mhdLines.getFirst().locations.getFirst().getVehicles().size() + "/" + MhdSimulator.mhdLines.getFirst().locations.getFirst().getMaxCapacity());
        locationState.setText("Location state: " + MhdSimulator.mhdLines.getFirst().locations.getFirst().getLocationState());

        if (MhdSimulator.mhdLines.getFirst().locations.getFirst().getVehicles().size() == MhdSimulator.mhdLines.getFirst().locations.getFirst().getMaxCapacity()){
            createNewBusButton.setDisable(true);
        }
        if (MhdSimulator.mhdLines.getFirst().locations.getFirst().getVehicles().isEmpty()) {
            vehicleOne.setVisible(false);
            vehicleText.setVisible(false);
        } else {
            vehicleOne.setText(MhdSimulator.mhdLines.getFirst().locations.getFirst().getVehicles().getFirst().getName());
            vehicleOne.setVisible(true);
            vehicleText.setVisible(true);
        }


    }

    public void onReturnClick(ActionEvent actionEvent) {
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

    public void onCreateNewBusClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bus-creator.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("MHD Simulator");
            stage.centerOnScreen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onVehicleOneClicked(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bus-editor.fxml"));
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
