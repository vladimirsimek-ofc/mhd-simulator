package com.vladimirsimek.mhd.logic.locations;

import com.vladimirsimek.mhd.logic.locations.Location;
import com.vladimirsimek.mhd.logic.vehicles.Vehicle;

public class AddVehicleCommand implements Command {
    private final Location location;
    private final Vehicle vehicle;

    public AddVehicleCommand(Location location, Vehicle vehicle) {
        this.location = location;
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        System.out.println("Executing AddVehicleCommand");
        location.addVehicle(vehicle);
    }
}