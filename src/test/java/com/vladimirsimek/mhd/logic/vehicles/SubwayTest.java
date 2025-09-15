package com.vladimirsimek.mhd.logic.vehicles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubwayTest {

    @Test
    public void testCharge() {
        Subway subway = new Subway("Test Subway");
        subway.charge();
        assertEquals(100, subway.getPowerLevel(), "Power level should be fully charged to 100.");
    }

    @Test
    public void testDischargeAndCharge() {
        Subway subway = new Subway("Test Subway");
        subway.discharge();
        assertEquals(90, subway.getPowerLevel(), "Power level should be reduced by 10 after discharge.");

        subway.charge();
        assertEquals(100, subway.getPowerLevel(), "Power level should be fully restored to 100 after charging.");
    }
}