package com.vladimirsimek.mhd.logic.vehicles;

public class Train extends ElectricVehicle {
    
    private int passengerCount;
    private final int maxPassengersCount;
    private VehicleState vehicleState;
    private int powerLevel;
    private String name;

    /**
     * Constructs a Train with the specified number of passengers, vehicle state, and power level.
     *
     */
    public Train(String name) {
        this.passengerCount = 0;
        this.maxPassengersCount = 600;
        this.vehicleState = VehicleState.IDLE;
        this.powerLevel = 100;
    }

    /**
     * Fully charges the train's power level to 100%.
     */
    @Override
    public void charge() {
        this.powerLevel = 100;
    }

    /**
     * Reduces the train's power level by 10%.
     */
    @Override
    public void discharge() {
        this.powerLevel -= 10;
    }

    /**
     * Retrieves the current power level of the train.
     *
     * @return the current power level as a float value.
     */
    @Override
    public int getPowerLevel() {
        return powerLevel;
    }

    /**
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Updates the vehicle state of the train.
     *
     * @param state the new state to set for the train.
     */
    @Override
    public void setVehicleState(VehicleState state) {
        this.vehicleState = state;
    }

    /**
     * Gets the current state of the train.
     *
     * @return the current VehicleState of the train.
     */
    @Override
    public VehicleState getVehicleState() {
        return vehicleState;
    }

    /**
     * Gets the number of passengers currently aboard the train.
     *
     * @return the current passenger count.
     */
    @Override
    public int getPassengerCount() {
        return passengerCount;
    }

    /**
     * Adds passengers to the train.
     * Note: Currently increments the passenger count by 1, ignoring the provided count.
     *
     * @param count the number of passengers to add (currently ignored).
     */
    @Override
    public void addPassengers(int count) {
        passengerCount += 1;
    }

    /**
     * Gets the maximum number of passengers the train can carry.
     *
     * @return the maximum passenger capacity.
     */
    @Override
    public int getMaxPassengersCount() {
        return maxPassengersCount;
    }

    /**
     * @return
     */
    @Override
    public float getGasLevel() {
        return 0;
    }

    /**
     *
     */
    @Override
    public void fillUp() {

    }
}
