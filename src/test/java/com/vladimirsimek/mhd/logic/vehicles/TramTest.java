package com.vladimirsimek.mhd.logic.vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TramTest {

    private Tram tram;

    @BeforeEach
    void setUp() {
        tram = new Tram("Test Tram");
    }

    @Test
    void testChargeSetsPowerLevelToFull() {
        // Arrange
        tram.discharge(); // Reduces power level
        tram.discharge(); // Reduces power level further

        // Act
        tram.charge();

        // Assert
        assertEquals(100, tram.getPowerLevel(), "Power level should be fully charged to 100 after calling charge()");
    }
}