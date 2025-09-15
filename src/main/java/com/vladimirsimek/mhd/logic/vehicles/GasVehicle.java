package com.vladimirsimek.mhd.logic.vehicles;

public abstract class GasVehicle extends Vehicle {
    /**
     * Retrieves the current gas level of the vehicle.
     *
     * @return the gas level as a float value.
     */
    public abstract float getGasLevel();

    /**
     * Refills the gas tank to its maximum capacity.
     */
    public abstract void fillUp();
}
