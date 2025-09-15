package com.vladimirsimek.mhd.logic.locations;

import com.vladimirsimek.mhd.logic.locations.Location;
import com.vladimirsimek.mhd.logic.locations.LocationState;

public class StateChangeNotificationDecorator extends LocationDecorator {
    public StateChangeNotificationDecorator(Location decoratedLocation) {
        super(decoratedLocation);
    }

    @Override
    public void setLocationState(LocationStates locationState) {
        System.out.println("[Notification] State of '" + decoratedLocation.getName() + "' changing from '" +
                decoratedLocation.getLocationState() + "' to '" + locationState + "'.");
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