package com.vladimirsimek.mhd.logic.locations;

public class LocationStateFree implements LocationState {
    @Override
    public void handleState(Location location) {
        System.out.println("The location " + location.getName() + " is now Free and vehicles can be added or removed.");
    }

    @Override
    public String getStateName() {
        return "FREE";
    }
}