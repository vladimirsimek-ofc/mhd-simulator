package com.vladimirsimek.mhd.logic.locations;

import com.vladimirsimek.mhd.logic.locations.Location;
import com.vladimirsimek.mhd.logic.locations.LocationStateFree;

import com.vladimirsimek.mhd.logic.vehicles.Vehicle;

public class LocationServant {

    /**
     * Moves a vehicle from one location to another, if possible.
     *
     * @param source      The source location from which the vehicle will be removed.
     * @param destination The destination location where the vehicle will be added.
     * @param vehicle     The vehicle to move.
     */
    public void moveVehicle(Location source, Location destination, Vehicle vehicle) {
        if (source.getVehicles().contains(vehicle)) {
            System.out.println("Moving vehicle '" + vehicle.getName() + "' from " + source.getName() + " to " + destination.getName());

            // Remove vehicle from the source location
            source.removeVehicle(vehicle);

            // Add vehicle to the destination location
            destination.addVehicle(vehicle);
        } else {
            System.out.println("Vehicle '" + vehicle.getName() + "' is not present in " + source.getName());
        }
    }

    /**
     * Checks if a location is at full capacity.
     *
     * @param location The location to check.
     * @return True if the location is at full capacity, false otherwise.
     */
    public boolean isLocationFull(Location location) {
        if (location.getMaxCapacity() == 0) {
            return false;
        }
        boolean full = location.getVehicles().size() >= location.getMaxCapacity();
        if (full) {
            System.out.println("Location " + location.getName() + " is full.");
        }
        return full;
    }

    /**
     * Resets the state of a location to FREE if applicable.
     *
     * @param location The location whose state will be reset.
     */
    public void resetLocationStateToFree(Location location) {
        if (location.getLocationState() != LocationStates.FREE) {
            System.out.println("Resetting state of " + location.getName() + " to FREE.");
            location.setLocationState(LocationStates.FREE);
        }
    }

    /**
     * Disables a location by setting its state to OUT_OF_SERVICE.
     *
     * @param location The location to disable.
     */
    public void disableLocation(Location location) {
        location.setLocationState(LocationStates.OUT_OF_SERVICE);
    }
}