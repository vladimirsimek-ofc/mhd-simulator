package com.vladimirsimek.mhd;

import com.vladimirsimek.mhd.logic.locations.Depot;
import com.vladimirsimek.mhd.logic.locations.DepotMaintenance;
import com.vladimirsimek.mhd.logic.locations.Stop;
import com.vladimirsimek.mhd.logic.simulation.Line;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class MhdSimulator extends Application {

    public static ArrayList<Line> mhdLines;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MhdSimulator.class.getResource("main-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("MHD Simulator");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public static void initialize() {
        mhdLines = new ArrayList<>();
        mhdLines.add(new Line("Line 1"));
        mhdLines.getFirst().addLocation(new Depot( "Depot 1", 1));
        mhdLines.getFirst().addLocation(new Stop( "Final stop"));
    }

    public static void main(String[] args) {
        initialize();
        launch();

        DepotMaintenance depotMaintenance = new DepotMaintenance("Central Depot");

    }
}