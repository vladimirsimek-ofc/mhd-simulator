package com.vladimirsimek.mhd.logic.locations;

import com.vladimirsimek.mhd.logic.vehicles.Bus;
import com.vladimirsimek.mhd.logic.vehicles.Vehicle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StationTest {

    /**
     * Tests for the addVehicle method in the Station class.
     * <p>
     * The addVehicle method is responsible for adding a Vehicle object
     * to the list of vehicles maintained by the Station instance.
     */

    @Test
    void testAddVehicleToEmptyList() {
        // Arrange
        Station station = new Station("Central Station");
        Vehicle vehicle = new Bus("City Bus");

        // Act
        station.addVehicle(vehicle);

        // Assert
        ArrayList<Vehicle> vehicles = station.getVehicles();
        assertEquals(1, vehicles.size());
        assertEquals(vehicle, vehicles.get(0));
    }

    @Test
    void testAddVehicleToNonEmptyList() {
        // Arrange
        Station station = new Station("Central Station");
        Vehicle vehicle1 = new Bus("City Bus");
        Vehicle vehicle2 = new Bus("School Bus");
        station.addVehicle(vehicle1);

        // Act
        station.addVehicle(vehicle2);

        // Assert
        ArrayList<Vehicle> vehicles = station.getVehicles();
        assertEquals(2, vehicles.size());
        assertEquals(vehicle1, vehicles.get(0));
        assertEquals(vehicle2, vehicles.get(1));
    }

    @Test
    void testAddNullVehicle() {
        // Arrange
        Station station = new Station("Central Station");

        // Act
        station.addVehicle(null);

        // Assert
        ArrayList<Vehicle> vehicles = station.getVehicles();
        assertEquals(1, vehicles.size());
        assertEquals(null, vehicles.get(0));
    }
}