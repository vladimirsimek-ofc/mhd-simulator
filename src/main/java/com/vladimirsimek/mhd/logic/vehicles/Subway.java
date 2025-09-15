package com.vladimirsimek.mhd.logic.vehicles;

public class Subway extends ElectricVehicle {

    private String name;
    private int passengerCount;
    private final int maxPassengersCount;
    private VehicleState vehicleState;
    private int powerLevel;

    /**
     * Constructs a Subway object with the specified initial state.
     *
     */
    public Subway(String name) {
        this.passengerCount = 0;
        this.maxPassengersCount = 600;
        this.vehicleState = VehicleState.IDLE;
        this.powerLevel = 100;
        this.name = name;
    }

    /**
     * Charges the subway by setting the power level to its maximum value of 1.0.
     */
    @Override
    public void charge() {
        this.powerLevel = 100;
    }

    /**
     * Decreases the subway's power level by 0.1 to simulate power consumption.
     */
    @Override
    public void discharge() {
        this.powerLevel -= 10;
    }

    /**
     * Retrieves the current power level of the subway.
     *
     * @return the power level as a float value.
     */
    @Override
    public int getPowerLevel() {
        return powerLevel;
    }

    /**
     * @return
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the current state of the vehicle (e.g., IDLE, RUNNING, OUT_OF_SERVICE).
     *
     * @param state the new state of the vehicle.
     */
    @Override
    public void setVehicleState(VehicleState state) {
        this.vehicleState = state;
    }

    /**
     * Retrieves the current state of the vehicle.
     *
     * @return the state of the vehicle.
     */
    @Override
    public VehicleState getVehicleState() {
        return vehicleState;
    }

    /**
     * Gets the current number of passengers in the subway.
     *
     * @return the number of passengers on board.
     */
    /**
     * Retrieves the current number of passengers in the subway.
     *
     * @return the number of passengers on board.
     */
    @Override
    public int getPassengerCount() {
        return passengerCount;
    }

    /**
     * Adds passengers to the subway, increasing the passenger count by the given
     * number. Ensures the passenger count does not exceed the maximum capacity.
     *
     * @param count the number of passengers to add.
     */
    /**
     * Adds passengers to the subway. The number of passengers to be added
     * is determined by the count parameter.
     * <p>
     * Note: This method currently increases the passenger count by 1,
     * regardless of the specified count parameter.
     *
     * @param count the number of passengers to be added (unused in the current implementation).
     */
    @Override
    public void addPassengers(int count) {
        passengerCount += 1;
    }

    /**
     * Retrieves the maximum number of passengers that the subway can hold.
     *
     * @return the maximum passenger capacity.
     */
    /**
     * Retrieves the maximum number of passengers that the subway can hold.
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
