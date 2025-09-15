package com.vladimirsimek.mhd.logic.vehicles;

public class Bus extends GasVehicle {

    private int gasLevel;
    private VehicleState vehicleState;
    private int passengerCount;
    private final int maxPassengersCount;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Constructor for the Bus class.
     * Initializes the gas level, vehicle state, passenger count, and maximum passenger capacity.
     */
    public Bus(String name) {
        this.gasLevel = 100;
        this.vehicleState = VehicleState.IDLE;
        this.passengerCount = 0;
        this.maxPassengersCount = 50;
        this.name = name;
    }

    /**
     * Sets the state of the vehicle.
     *
     * @param state The new state of the vehicle.
     */
    @Override
    public void setVehicleState(VehicleState state) {
        this.vehicleState = state;
    }

    /**
     * Retrieves the current state of the vehicle.
     *
     * @return The current state of the vehicle.
     */
    @Override
    public VehicleState getVehicleState() {
        return vehicleState;
    }

    /**
     * Retrieves the current number of passengers on the bus.
     *
     * @return The current number of passengers.
     */
    @Override
    public int getPassengerCount() {
        return passengerCount;
    }

    /**
     * Adds passengers to the bus.
     *
     * @param count The number of passengers to add. Note: This method currently increments by 1, regardless of the input value.
     */
    @Override
    public void addPassengers(int count) {
        this.passengerCount += 1;
    }

    /**
     * Retrieves the maximum passenger capacity of the bus.
     *
     * @return The maximum number of passengers the bus can hold.
     */
    @Override
    public int getMaxPassengersCount() {
        return maxPassengersCount;
    }

    /**
     * Retrieves the current gas level of the bus.
     *
     * @return The gas level, represented as a float between 0 and 1.
     */
    @Override
    public float getGasLevel() {
        return gasLevel;
    }

    /**
     * Refuels the bus, setting the gas level to full (1.0).
     */
    @Override
    public void fillUp() {
        this.gasLevel = 100;
    }
}
