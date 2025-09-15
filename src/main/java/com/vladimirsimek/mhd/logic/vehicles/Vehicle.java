package com.vladimirsimek.mhd.logic.vehicles;

public abstract class Vehicle {

    public abstract String getName();

    public abstract void setName(String name);

    /**
     * Sets the current operational state of the vehicle.
     *
     * @param state The new state to set for the vehicle.
     */
    public abstract void setVehicleState(VehicleState state);

    /**
     * Retrieves the current operational state of the vehicle.
     *
     * @return The current state of the vehicle.
     */
    public abstract VehicleState getVehicleState();

    /**
     * Retrieves the number of passengers currently in the vehicle.
     *
     * @return The current number of passengers occupying the vehicle.
     */
    public abstract int getPassengerCount();

    /**
     * Adds the specified number of passengers to the vehicle.
     *
     * @param count The number of passengers to add.
     */
    public abstract void addPassengers(int count);

    /**
     * Retrieves the maximum number of passengers the vehicle can accommodate.
     *
     * @return The maximum passenger capacity of the vehicle.
     */
    public abstract int getMaxPassengersCount();

    public abstract float getGasLevel();

    public abstract void fillUp();
}
