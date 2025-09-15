package com.vladimirsimek.mhd.logic.locations;

import com.vladimirsimek.mhd.logic.vehicles.Vehicle;

import java.util.ArrayList;

/**
 * Represents a depot where vehicles are stored and managed.
 * The depot can hold vehicles and track its state.
 */
public class Depot extends Location {
    private String name;
    private final ArrayList<Vehicle> vehicles;
    private LocationStates locationState;
    private final int maxCapacity;
    private final ArrayList<Observer> observers = new ArrayList<>();

    /**
     * Constructs a new Depot with the specified name.
     *
     * @param name the name of the depot
     */
    public Depot(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.vehicles = new ArrayList<>();
        this.locationState = LocationStates.FREE;
        addObserver(new Observer() {
            @Override
            public void update(String locationName, String newState) {

            }
        });
    }
    Location decoratedDepot = new LoggingDecorator(
            new MetricsDecorator(
                    new StateChangeNotificationDecorator(this)
            ));


    public void addObserver(Observer observer) {
        observers.add(observer);
    }


    /**
     * Retrieves the name of the depot.
     *
     * @return the name of the depot
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the depot.
     *
     * @param name the new name to set for the depot
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the list of vehicles currently stored in the depot.
     *
     * @return a list of vehicles in the depot
     */
    @Override
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    /**
     * Adds a vehicle to the depot.
     *
     * @param vehicle the vehicle to add
     */
    @Override
    public void addVehicle(Vehicle vehicle) {
        if (this.vehicles.size() < this.maxCapacity) {
            this.vehicles.add(vehicle);
        }
    }

    /**
     * Removes a vehicle from the depot.
     *
     * @param vehicle the vehicle to remove
     */
    @Override
    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }

    /**
     * Retrieves the current state of the depot location.
     *
     * @return the current location state of the depot
     */
    @Override
    public LocationStates getLocationState() {
        return locationState;
    }

    /**
     * Sets the current state of the depot location.
     *
     * @param locationState the new location state to set
     */
    @Override
    public void setLocationState(LocationStates locationState) {
        this.locationState = locationState;
    }

    public int getMaxCapacity() {
        return maxCapacity;

    }

    /**
     * @param name
     * @param maxCapacity
     * @return
     */
    @Override
    public Location createLocation(String name, int maxCapacity) {
        new LocationStateFree().handleState(new Depot(name, maxCapacity));
        return new Depot(name, maxCapacity);
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
