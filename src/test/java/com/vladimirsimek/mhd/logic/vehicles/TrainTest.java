package com.vladimirsimek.mhd.logic.vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainTest {

    private Train train;

    @BeforeEach
    public void setUp() {
        train = new Train("TestTrain");
    }

    @Test
    public void testChargeMethodResetsPowerLevelTo100() {
        // Arrange
        train.discharge();
        train.discharge(); // Reduce power level for testing
        assertEquals(80, train.getPowerLevel()); // Ensure power level is reduced

        // Act
        train.charge();

        // Assert
        assertEquals(100, train.getPowerLevel(), "Power level should be reset to 100 after charging");
    }

    @Test
    public void testPowerLevelRemains100WhenChargeCalledWhileAlreadyAt100() {
        // Arrange
        assertEquals(100, train.getPowerLevel()); // Ensure train starts at 100

        // Act
        train.charge();

        // Assert
        assertEquals(100, train.getPowerLevel(), "Power level should remain 100 when already fully charged");
    }
}