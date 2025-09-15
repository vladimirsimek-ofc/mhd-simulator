package com.vladimirsimek.mhd.logic.locations;

public abstract class LocationMaintenance {

    /**
     * Template method defining the algorithm for performing maintenance.
     */
    public final void performMaintenance() {
        startMaintenance();              // Step 1: Common implementation
        performSpecificMaintenance();    // Step 2: Customized for each subclass
        endMaintenance();                // Step 3: Common implementation
    }

    /**
     * Start maintenance - default implementation.
     */
    protected void startMaintenance() {
        System.out.println("Starting maintenance for " + getLocationName() + "...");
    }

    /**
     * Perform specific maintenance - MUST be implemented by subclasses.
     */
    protected abstract void performSpecificMaintenance();

    /**
     * End maintenance - default implementation.
     */
    protected void endMaintenance() {
        System.out.println("Ending maintenance for " + getLocationName() + ".");
    }

    /**
     * Gets the name of the location - MUST be implemented by subclasses.
     *
     * @return The name of the location.
     */
    protected abstract String getLocationName();
}