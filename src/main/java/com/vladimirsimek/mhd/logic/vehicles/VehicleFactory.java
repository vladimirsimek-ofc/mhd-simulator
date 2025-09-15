package com.vladimirsimek.mhd.logic.vehicles;

public class VehicleFactory {
    /**
     * Factory method to create instances of vehicles based on VehicleType.
     *
     * @param type The type of vehicle to create.
     * @param name The name of the vehicle.
     * @return An instance of the corresponding vehicle type.
     */
    public static Vehicle createVehicle(VehicleType type, String name) {

        return switch (type) {
            case BUS -> new Bus(name);
            case TRAM -> new Tram(name);
            case SUBWAY -> new Subway(name);
            case TRAIN -> new Train(name);
        };
    }
}