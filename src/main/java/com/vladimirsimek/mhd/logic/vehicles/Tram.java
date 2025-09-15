package com.vladimirsimek.mhd.logic.vehicles;

/**
 * The Tram class represents an electric-powered tram vehicle.
 * It extends the ElectricVehicle class and implements vehicle-specific functionalities.
 */
public class Tram extends ElectricVehicle {
    private int passengerCount;
    private final int maxPassengersCount;
    private VehicleState vehicleState;
    private int powerLevel;
    private String name;

    /**
     * Constructs a new Tram instance with the specified parameters.
     *
     */
    public Tram(String name) {
        this.passengerCount = 0;
        this.maxPassengersCount = 100;
        this.vehicleState = VehicleState.IDLE;
        this.powerLevel = 100;
    }

    /**
     * Charges the tram by setting its power level to full (1.0).
     */
    @Override
    public void charge() {
        this.powerLevel = 100;
    }

    /**
     * Discharges the tram's battery by reducing the power level by 0.1.
     */
    @Override
    public void discharge() {
        this.powerLevel -= 10;
    }

    /**
     * Retrieves the current battery power level of the tram.
     *
     * @return The current power level as a float (0 to 1).
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
     * Sets the current state of the tram.
     *
     * @param state The new state of the tram (e.g., running, out of service).
     */
    @Override
    public void setVehicleState(VehicleState state) {
        this.vehicleState = state;
    }

    /**
     * Retrieves the current state of the tram.
     *
     * @return The current state of the tram.
     */
    @Override
    public VehicleState getVehicleState() {
        return vehicleState;
    }

    /**
     * Retrieves the current number of passengers on the tram.
     *
     * @return The current passenger count.
     */
    @Override
    public int getPassengerCount() {
        return passengerCount;
    }

    /**
     * Adds a specified number of passengers to the tram.
     *
     * @param count The number of passengers to add. Note: This method currently increases the passenger count by 1 regardless of the input value.
     */
    @Override
    public void addPassengers(int count) {
        passengerCount += 1;
    }

    /**
     * Retrieves the maximum passenger capacity of the tram.
     *
     * @return The maximum number of passengers the tram can hold.
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
