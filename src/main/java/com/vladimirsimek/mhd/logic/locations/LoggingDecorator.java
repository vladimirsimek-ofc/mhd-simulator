package com.vladimirsimek.mhd.logic.locations;

import com.vladimirsimek.mhd.logic.locations.Location;
import com.vladimirsimek.mhd.logic.vehicles.Vehicle;

public class LoggingDecorator extends LocationDecorator {

    public LoggingDecorator(Location decoratedLocation) {
        super(decoratedLocation);
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        super.addVehicle(vehicle);
        System.out.println("[Logging] Vehicle '" + vehicle.getName() + "' added to '" + decoratedLocation.getName() + "'.");
    }

    @Override
    public void removeVehicle(Vehicle vehicle) {
        super.removeVehicle(vehicle);
        System.out.println("[Logging] Vehicle '" + vehicle.getName() + "' removed from '" + decoratedLocation.getName() + "'.");
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
        return null;
    }
}