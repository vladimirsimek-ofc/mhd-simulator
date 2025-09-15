package com.vladimirsimek.mhd.logic.vehicles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest {

    /**
     * This test class tests the `getName` method in the `Bus` class.
     * The `getName` method is part of the `Bus` class, which represents a type of gas-powered vehicle.
     * Test cases ensure the method correctly retrieves the name of a bus instance.
     */

    @Test
    void testGetNameReturnsCorrectNameWhenSetInConstructor() {
        // Arrange
        String expectedName = "City Bus";
        Bus bus = new Bus(expectedName);

        // Act
        String actualName = bus.getName();

        // Assert
        assertEquals(expectedName, actualName, "The name should match the value set in the constructor.");
    }

    @Test
    void testGetNameReturnsUpdatedNameWhenSetWithSetter() {
        // Arrange
        String initialName = "School Bus";
        String updatedName = "Night Bus";
        Bus bus = new Bus(initialName);
        bus.setName(updatedName);

        // Act
        String actualName = bus.getName();

        // Assert
        assertEquals(updatedName, actualName, "The name should match the value set using the setter.");
    }
}