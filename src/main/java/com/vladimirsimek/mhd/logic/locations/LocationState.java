package com.vladimirsimek.mhd.logic.locations;

public interface LocationState {
    void handleState(Location location);
    String getStateName();
}