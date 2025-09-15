package com.vladimirsimek.mhd.logic.locations;

import com.vladimirsimek.mhd.logic.vehicles.Vehicle;

import java.util.ArrayList;

public class Station extends Location {
    
    private String name;
    private final ArrayList<Vehicle> vehicles;
    private LocationStates locationState;

    /**
     * Constructor for the Station class.
     * Initializes the station's name, vehicles list, and sets the initial location state to FREE.
     *
     * @param name The name of the station.
     */
    public Station(String name) {
        this.name = name;
        this.vehicles = new ArrayList<>();
        this.locationState = LocationStates.FREE;
    }

    /**
     * Retrieves the name of the station.
     *
     * @return The name of the station.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Updates the name of the station.
     *
     * @param name The new name to set for the station.
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the list of vehicles currently associated with the station.
     *
     * @return An ArrayList of vehicles at the station.
     */
    @Override
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    /**
     * Adds a vehicle to the station's list of vehicles.
     *
     * @param vehicle The vehicle to add to the station.
     */
    @Override
    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    /**
     * Removes a vehicle from the station's list of vehicles.
     *
     * @param vehicle The vehicle to remove from the station.
     */
    @Override
    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }

    /**
     * Retrieves the current state of the station.
     *
     * @return The location state of the station.
     */
    @Override
    public LocationStates getLocationState() {
        return locationState;
    }

    /**
     * Updates the state of the station.
     *
     * @param locationState The new location state to set for the station.
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
        return new Station(name);
    }
}
