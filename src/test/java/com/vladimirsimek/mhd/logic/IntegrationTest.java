package com.vladimirsimek.mhd.logic;

import com.vladimirsimek.mhd.logic.locations.Depot;
import com.vladimirsimek.mhd.logic.vehicles.Vehicle;
import com.vladimirsimek.mhd.logic.vehicles.VehicleFactory;
import com.vladimirsimek.mhd.logic.vehicles.VehicleType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Integration test for the application
public class IntegrationTest {

    private Depot depotA;
    private Depot depotB;
    private final int maxCapacityA = 3;
    private final int maxCapacityB = 5;

    @BeforeEach
    void initializeWithDependencies() {
        // Initialize multiple depots for integration testing
        depotA = new Depot("Depot A", maxCapacityA);
        depotB = new Depot("Depot B", maxCapacityB);
    }

    @Test
    void testVehiclesInteractionAcrossDepots() {
        // Add vehicles to Depot A
        Vehicle busA = VehicleFactory.createVehicle(VehicleType.BUS, "Bus 1");
        Vehicle busB = VehicleFactory.createVehicle(VehicleType.BUS, "Bus 1");

        depotA.addVehicle(busA);
        depotA.addVehicle(busB);

        assertEquals(2, depotA.getVehicles().size());
        assertTrue(depotA.getVehicles().contains(busA));
        assertTrue(depotA.getVehicles().contains(busB));

        // Transport busB to Depot B
        depotA.removeVehicle(busB);
        depotB.addVehicle(busB);

        // Verify interaction between Depot A and Depot B
        assertEquals(1, depotA.getVehicles().size());
        assertEquals(1, depotB.getVehicles().size());

        assertTrue(depotA.getVehicles().contains(busA));
        assertFalse(depotA.getVehicles().contains(busB));
        assertTrue(depotB.getVehicles().contains(busB));
    }

    @Test
    void testMaxCapacityAcrossDepots() {
        // Fill Depot A to its capacity
        for (int i = 0; i < maxCapacityA; i++) {
            depotA.addVehicle(VehicleFactory.createVehicle(VehicleType.BUS, "Bus " + i));
        }

        assertEquals(maxCapacityA, depotA.getVehicles().size());

        // Add vehicles to Depot B
        for (int i = 0; i < maxCapacityB; i++) {
            depotB.addVehicle(VehicleFactory.createVehicle(VehicleType.BUS, "Bus " + i));
        }

        assertEquals(maxCapacityB, depotB.getVehicles().size());

        // Validate that capacity logic is independent for both depots
        assertNotEquals(depotA.getVehicles().size(), depotB.getVehicles().size());
    }

    @Test
    void testEmptyDepotBehavior() {
        // Check initial state
        assertEquals(0, depotA.getVehicles().size());
        assertEquals(0, depotB.getVehicles().size());

        // Remove vehicle from an empty depot should not result in an error
        Vehicle nonExistentVehicle = VehicleFactory.createVehicle(VehicleType.BUS, "Ghost Bus");
        depotA.removeVehicle(nonExistentVehicle);

        // Depot should still be empty with no errors
        assertEquals(0, depotA.getVehicles().size());
    }

    @Test
    void testMultipleDepotsInteraction() {
        // Add vehicles to Depot A
        Vehicle vehicle1 = VehicleFactory.createVehicle(VehicleType.BUS, "Bus 1");
        Vehicle vehicle2 = VehicleFactory.createVehicle(VehicleType.BUS, "Bus 2");
        depotA.addVehicle(vehicle1);
        depotA.addVehicle(vehicle2);

        assertEquals(2, depotA.getVehicles().size());

        // Transfer all vehicles from Depot A to Depot B
        while (!depotA.getVehicles().isEmpty()) {
            Vehicle vehicle = depotA.getVehicles().getFirst();
            depotA.removeVehicle(vehicle);
            depotB.addVehicle(vehicle);
        }

        // Verify depots are updated correctly
        assertEquals(0, depotA.getVehicles().size());
        assertEquals(2, depotB.getVehicles().size());

        assertTrue(depotB.getVehicles().contains(vehicle1));
        assertTrue(depotB.getVehicles().contains(vehicle2));
    }
}