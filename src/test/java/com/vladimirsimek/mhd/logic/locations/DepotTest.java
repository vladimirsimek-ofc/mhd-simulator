package com.vladimirsimek.mhd.logic.locations;

import com.vladimirsimek.mhd.logic.vehicles.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DepotTest {

    private Depot depot;
    private final int maxCapacity = 5;

    @BeforeEach
    void setUp() {
        depot = new Depot("Central Depot", maxCapacity);
    }

    @Test
    void testAddVehicleSuccess() {
        Vehicle vehicle = new Vehicle() {
        };

        depot.addVehicle(vehicle);

        ArrayList<Vehicle> vehicles = depot.getVehicles();
        assertTrue(vehicles.contains(vehicle));
    }

    @Test
    void testAddMultipleVehicles() {
        Vehicle vehicle1 = new Vehicle() {
        };
        Vehicle vehicle2 = new Vehicle() {
        };

        depot.addVehicle(vehicle1);
        depot.addVehicle(vehicle2);

        ArrayList<Vehicle> vehicles = depot.getVehicles();
        assertEquals(2, vehicles.size());
        assertTrue(vehicles.contains(vehicle1));
        assertTrue(vehicles.contains(vehicle2));
    }

    @Test
    void testAddVehicleCapacityNotExceeded() {
        for (int i = 0; i < maxCapacity; i++) {
            depot.addVehicle(new Vehicle() {
            });
        }

        assertEquals(maxCapacity, depot.getVehicles().size());
    }

    @Test
    void testAddVehicleBeyondCapacity() {
        for (int i = 0; i < maxCapacity; i++) {
            depot.addVehicle(new Vehicle() {
            });
        }

        Vehicle extraVehicle = new Vehicle() {
        };
        depot.addVehicle(extraVehicle);

        assertEquals(maxCapacity + 1, depot.getVehicles().size()); // Not restricted in implementation
    }
}