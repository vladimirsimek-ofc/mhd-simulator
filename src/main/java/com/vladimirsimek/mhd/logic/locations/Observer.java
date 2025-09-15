package com.vladimirsimek.mhd.logic.locations;

public interface Observer {
    void update(String locationName, String newState);
}