package com.vladimirsimek.mhd.logic.vehicles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleFactoryTest {

    /**
     * Tests for the createVehicle method in VehicleFactory.
     * <p>
     * Method Description:
     * The createVehicle method is a static method in the VehicleFactory class
     * that creates and returns a specific type of Vehicle object based on the
     * provided VehicleType and name.
     */

    @Test
    void testCreateBus() {
        // Arrange
        VehicleType type = VehicleType.BUS;
        String name = "City Bus";

        // Act
        Vehicle vehicle = VehicleFactory.createVehicle(type, name);

        // Assert
        assertNotNull(vehicle);
        assertEquals("City Bus", vehicle.getName());
        assertTrue(vehicle instanceof Bus);
    }

    @Test
    void testCreateTram() {
        // Arrange
        VehicleType type = VehicleType.TRAM;
        String name = "Downtown Tram";

        // Act
        Vehicle vehicle = VehicleFactory.createVehicle(type, name);

        // Assert
        assertNotNull(vehicle);
        assertEquals("Downtown Tram", vehicle.getName());
        assertTrue(vehicle instanceof Tram);
    }

    @Test
    void testCreateSubway() {
        // Arrange
        VehicleType type = VehicleType.SUBWAY;
        String name = "Metro Express";

        // Act
        Vehicle vehicle = VehicleFactory.createVehicle(type, name);

        // Assert
        assertNotNull(vehicle);
        assertEquals("Metro Express", vehicle.getName());
        assertTrue(vehicle instanceof Subway);
    }

    @Test
    void testCreateTrain() {
        // Arrange
        VehicleType type = VehicleType.TRAIN;
        String name = "Regional Train";

        // Act
        Vehicle vehicle = VehicleFactory.createVehicle(type, name);

        // Assert
        assertNotNull(vehicle);
        assertEquals("Regional Train", vehicle.getName());
        assertTrue(vehicle instanceof Train);
    }
}