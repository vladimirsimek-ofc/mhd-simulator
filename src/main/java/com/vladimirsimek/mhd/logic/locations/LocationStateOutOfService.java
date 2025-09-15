package com.vladimirsimek.mhd.logic.locations;

public class LocationStateOutOfService implements LocationState {
    @Override
    public void handleState(Location location) {
        System.out.println("The location " + location.getName() + " is Out of Service. No operations can be performed.");
    }

    @Override
    public String getStateName() {
        return "OUT_OF_SERVICE";
    }
}