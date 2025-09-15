package com.vladimirsimek.mhd.logic.simulation;

import com.vladimirsimek.mhd.logic.locations.Location;
import com.vladimirsimek.mhd.logic.locations.LocationState;
import com.vladimirsimek.mhd.logic.locations.LocationStates;
import com.vladimirsimek.mhd.logic.vehicles.Vehicle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    /**
     * Test class Line and its method addLocation.
     * <p>
     * This method is responsible for adding a Location instance to the Line's locations list.
     * Each test validates the expected behavior of this method under different scenarios.
     */

    @Test
    void testAddLocationToEmptyLine() {
        // Arrange
        Line line = new Line("Test Line");
        Location location = new LocationStub("Location A");

        // Act
        line.addLocation(location);

        // Assert
        assertEquals(1, line.locations.size());
        assertTrue(line.locations.contains(location));
    }

    @Test
    void testAddMultipleLocations() {
        // Arrange
        Line line = new Line("Test Line");
        Location location1 = new LocationStub("Location A");
        Location location2 = new LocationStub("Location B");

        // Act
        line.addLocation(location1);
        line.addLocation(location2);

        // Assert
        assertEquals(2, line.locations.size());
        assertTrue(line.locations.contains(location1));
        assertTrue(line.locations.contains(location2));
    }

    @Test
    void testAddSameLocationTwice() {
        // Arrange
        Line line = new Line("Test Line");
        Location location = new LocationStub("Location A");

        // Act
        line.addLocation(location);
        line.addLocation(location);

        // Assert
        assertEquals(2, line.locations.size());
        assertEquals(location, line.locations.get(0));
        assertEquals(location, line.locations.get(1));
    }

    @Test
    void testAddNullLocation() {
        // Arrange
        Line line = new Line("Test Line");

        // Act
        line.addLocation(null);

        // Assert
        assertEquals(1, line.locations.size());
        assertNull(line.locations.get(0));
    }

    // Stub class for Location to support testing
    static class LocationStub extends Location {
        private String name;

        public LocationStub(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public ArrayList<Vehicle> getVehicles() {
            return new ArrayList<>();
        }

        /**
         * @param vehicle The Vehicle object to be added to the location.
         */
        public void addVehicle(Vehicle vehicle) {

        }

        /**
         * @param vehicle The Vehicle object to be removed from the location.
         */
        public void removeVehicle(Vehicle vehicle) {

        }

        /**
         * @return
         */
        public LocationStates getLocationState() {
            return null;
        }

        /**
         * @param locationState The new state to assign to the location.
         */
        public void setLocationState(LocationStates locationState) {

        }

        /**
         * @return
         */
        @Override
        public int getMaxCapacity() {
            return 0;
        }

        /**
         * @param name
         * @param maxCapacity
         * @return
         */
        @Override
        public Location createLocation(String name, int maxCapacity) {
            return null;
        }

        /**
         * @param name
         * @return
         */
        @Override
        public Location createLocation(String name) {
            return null;
        }


    }
}