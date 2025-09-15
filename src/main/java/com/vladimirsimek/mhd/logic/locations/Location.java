package com.vladimirsimek.mhd.logic.locations;

import com.vladimirsimek.mhd.logic.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Map;

/**
 * The Location class represents an abstract concept for a location where vehicles can be present.
 * It provides a blueprint for various types of locations, such as stops, stations, and depots.
 */
public abstract class Location {

    /**
     * Retrieves the name of the location.
     *
     * @return A string representing the name of the location.
     */
    abstract public String getName();

    /**
     * Sets the name of the location.
     *
     * @param name The new name to assign to the location.
     */
    public abstract void setName(String name);

    /**
     * Retrieves a list of vehicles currently associated with the location.
     *
     * @return An ArrayList of Vehicle objects present at the location.
     */
    public abstract ArrayList<Vehicle> getVehicles();

    /**
     * Adds a vehicle to the location.
     *
     * @param vehicle The Vehicle object to be added to the location.
     */
    public abstract void addVehicle(Vehicle vehicle);

    /**
     * Removes a vehicle from the location.
     *
     * @param vehicle The Vehicle object to be removed from the location.
     */
    public abstract void removeVehicle(Vehicle vehicle);

    /**
     * Retrieves the current state of the location.
     *
     * @return The current state of the location as a LocationState object.
     */
    public abstract LocationStates getLocationState();

    /**
     * Sets the state of the location.
     *
     * @param locationState The new state to assign to the location.
     */
    public abstract void setLocationState(LocationStates locationState);

    public abstract int getMaxCapacity();

    public abstract Location createLocation(String name, int maxCapacity);
    public abstract Location createLocation(String name);
}
