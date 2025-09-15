package com.vladimirsimek.mhd.logic.locations;

public class DepotMaintenance extends LocationMaintenance {
    private String depotName;

    public DepotMaintenance(String depotName) {
        this.depotName = depotName;
    }

    @Override
    protected void performSpecificMaintenance() {
        System.out.println("Cleaning all buses in depot " + depotName + ".");
        System.out.println("Performing equipment checks.");
    }

    @Override
    protected String getLocationName() {
        return depotName;
    }
}