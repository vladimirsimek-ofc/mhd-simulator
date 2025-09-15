package com.vladimirsimek.mhd.logic.locations;

public class LocationStateOccupied implements LocationState {
    @Override
    public void handleState(Location location) {
        System.out.println("The location " + location.getName() + " is now Occupied. No additional vehicles can be added.");
    }

    @Override
    public String getStateName() {
        return "OCCUPIED";
    }
}