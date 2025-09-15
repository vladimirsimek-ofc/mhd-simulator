package com.vladimirsimek.mhd.logic.locations;

import com.vladimirsimek.mhd.logic.locations.Location;
import com.vladimirsimek.mhd.logic.vehicles.Vehicle;

public class MetricsDecorator extends LocationDecorator {
    private int fullCapacityCount = 0;

    public MetricsDecorator(Location decoratedLocation) {
        super(decoratedLocation);
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        super.addVehicle(vehicle);

        if (decoratedLocation.getVehicles().size() == decoratedLocation.getMaxCapacity()) {
            fullCapacityCount++;
            System.out.println("[Metrics] '" + decoratedLocation.getName() + "' has reached maximum capacity " + fullCapacityCount + " time(s).");
        }
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