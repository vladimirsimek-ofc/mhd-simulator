package com.vladimirsimek.mhd.logic.locations;

import com.vladimirsimek.mhd.logic.vehicles.Vehicle;

import java.util.ArrayList;

public class Stop extends Location {
    private String name;
    private final ArrayList<Vehicle> vehicles;
    private LocationStates locationState;

    /**
     * Constructs a Stop with the specified name.
     * Initializes the vehicles list as empty and sets the location state to FREE.
     *
     * @param name The name of the stop.
     */
    public Stop(String name) {
        this.name = name;
        this.vehicles = new ArrayList<>();
        this.locationState = LocationStates.FREE;
    }

    /**
     * Retrieves the name of this stop.
     *
     * @return The name of the stop as a String.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Sets the name of this stop.
     *
     * @param name The new name for the stop.
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the list of vehicles at this stop.
     *
     * @return An ArrayList containing vehicles at the stop.
     */
    @Override
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    /**
     * Adds a vehicle to the list of vehicles at this stop.
     *
     * @param vehicle The vehicle to be added.
     */
    @Override
    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    /**
     * Removes a vehicle from the list of vehicles at this stop.
     *
     * @param vehicle The vehicle to be removed.
     */
    @Override
    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }

    /**
     * Retrieves the current state of this stop.
     *
     * @return The state of the location as a LocationState enum value.
     */
    @Override
    public LocationStates getLocationState() {
        return locationState;
    }

    /**
     * Sets the state of this stop.
     *
     * @param locationState The new state for the location.
     */
    @Override
    public void setLocationState(LocationStates locationState) {
        this.locationState = locationState;
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
        return new Stop(name);
    }

}
