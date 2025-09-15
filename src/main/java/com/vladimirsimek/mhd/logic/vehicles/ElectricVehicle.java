package com.vladimirsimek.mhd.logic.vehicles;

public abstract class ElectricVehicle extends Vehicle {

    /**
     * Charges the electric vehicle's battery.
     */
    public abstract void charge();

    /**
     * Reduces the electric vehicle's battery power by discharging it.
     */
    public abstract void discharge();

    /**
     * Retrieves the current battery power level of the electric vehicle.
     *
     * @return the current power level as a float value.
     */
    public abstract int getPowerLevel();

}
