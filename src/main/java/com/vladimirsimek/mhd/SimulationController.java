package com.vladimirsimek.mhd;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SimulationController implements Initializable {
    public CheckBox isNewBusNamedRight;
    public CheckBox isNewStopNamedRight;
    public Circle freeSpaceCircle;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        javafx.animation.PauseTransition pause = new javafx.animation.PauseTransition(javafx.util.Duration.millis(100));
        pause.setOnFinished(event -> {
            boolean isNewBusNameRight = false;
            boolean isNewStopNameRight = false;

            if (MhdSimulator.mhdLines.getFirst().locations.size() == 3) {
                freeSpaceCircle.setFill(javafx.scene.paint.Color.RED);

            }

            if (!MhdSimulator.mhdLines.getFirst().locations.getFirst().getVehicles().isEmpty()) {
                if (MhdSimulator.mhdLines.getFirst().locations.getFirst().getVehicles().getFirst().getName().equals("Bus 1")) {
                    isNewBusNameRight = true;
                    isNewBusNamedRight.setSelected(true);
                }
            }
            if (MhdSimulator.mhdLines.getFirst().locations.size() == 3) {
                if (MhdSimulator.mhdLines.getFirst().locations.get(2).getName().equals("Stop 1")) {
                    isNewStopNameRight = true;
                    isNewStopNamedRight.setSelected(true);
                }
            }

            isNewBusNamedRight.setSelected(isNewBusNameRight);
            isNewStopNamedRight.setSelected(isNewStopNameRight);

            if (isNewBusNameRight && isNewStopNameRight) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("assignment-completed.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 800, 600);
                    Stage stage = (Stage) isNewBusNamedRight.getScene().getWindow();
                    stage.setScene(scene);
                    stage.setTitle("MHD Simulator");
                    stage.centerOnScreen();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        pause.play();
    }


    public void onDepotClicked(ActionEvent actionEvent) {
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

    public void onFreeSpaceClicked(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("stop-creator.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("MHD Simulator");
            stage.centerOnScreen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onFinalStopClicked(ActionEvent actionEvent) {
    }
}
