package com.vladimirsimek.mhd.logic.locations;

import com.vladimirsimek.mhd.logic.locations.Location;
import com.vladimirsimek.mhd.logic.locations.LocationState;
import com.vladimirsimek.mhd.logic.locations.LocationStates;
import com.vladimirsimek.mhd.logic.vehicles.Vehicle;

import java.util.ArrayList;

public abstract class LocationDecorator extends Location {
    protected Location decoratedLocation;

    public LocationDecorator(Location decoratedLocation) {
        this.decoratedLocation = decoratedLocation;
    }

    @Override
    public String getName() {
        return decoratedLocation.getName();
    }

    @Override
    public void setName(String name) {
        decoratedLocation.setName(name);
    }

    @Override
    public ArrayList<Vehicle> getVehicles() {
        return decoratedLocation.getVehicles();
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        decoratedLocation.addVehicle(vehicle);
    }

    @Override
    public void removeVehicle(Vehicle vehicle) {
        decoratedLocation.removeVehicle(vehicle);
    }

    @Override
    public LocationStates getLocationState() {
        return decoratedLocation.getLocationState();
    }

    @Override
    public void setLocationState(LocationStates locationState) {
        decoratedLocation.setLocationState(locationState);
    }

    @Override
    public int getMaxCapacity() {
        return decoratedLocation.getMaxCapacity();
    }
}