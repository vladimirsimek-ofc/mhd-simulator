package com.vladimirsimek.mhd.logic.simulation;

import com.vladimirsimek.mhd.logic.locations.Location;
import com.vladimirsimek.mhd.logic.vehicles.Vehicle;

import java.util.ArrayList;

/**
 * The Line class represents a transportation line that consists of locations and vehicles.
 * It allows adding and removing vehicles and locations, and managing the line's name.
 */
public class Line {
    public final ArrayList<Location> locations;
    private String name;

    /**
     * Constructs a new Line with the specified name.
     * Initializes empty lists for locations and vehicles.
     *
     * @param name The name of the line.
     */
    public Line(String name) {
        locations = new ArrayList<>();
        this.name = name;
    }

    /**
     * Retrieves the name of the line.
     *
     * @return The name of the line as a String.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the line.
     *
     * @param name The new name for the line.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Adds a location to the line's list of locations.
     *
     * @param location The location to be added.
     */
    public void addLocation(Location location) {
        locations.add(location);
    }

    /**
     * Removes a location from the line's list of locations.
     *
     * @param location The location to be removed.
     */
    public void removeLocation(Location location) {
        locations.remove(location);
    }
}
