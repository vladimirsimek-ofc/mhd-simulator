package com.vladimirsimek.mhd.logic.locations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StopTest {

    /**
     * This class tests the getName method of the Stop class.
     * The getName method is supposed to return the name of the Stop instance.
     */

    @Test
    void testGetNameReturnsCorrectName() {
        // Arrange
        String expectedName = "Main Station";
        Stop stop = new Stop(expectedName);

        // Act
        String actualName = stop.getName();

        // Assert
        assertEquals(expectedName, actualName, "The getName method should return the name of the Stop.");
    }

    @Test
    void testGetNameWithEmptyName() {
        // Arrange
        String expectedName = "";
        Stop stop = new Stop(expectedName);

        // Act
        String actualName = stop.getName();

        // Assert
        assertEquals(expectedName, actualName, "The getName method should handle an empty string as a name.");
    }

    @Test
    void testGetNameWithSpecialCharacters() {
        // Arrange
        String expectedName = "@Stop! #123";
        Stop stop = new Stop(expectedName);

        // Act
        String actualName = stop.getName();

        // Assert
        assertEquals(expectedName, actualName, "The getName method should correctly handle names with special characters.");
    }
}