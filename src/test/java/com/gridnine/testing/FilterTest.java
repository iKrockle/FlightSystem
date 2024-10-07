package com.gridnine.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {

    @Test
    void noFilter() {
        String expectedResult = FlightBuilder.createFlights().toString();
        String actualResult = Filter.noFilter().toString();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void noFlightOut() {
        String expectedResult1 = FlightBuilder.createFlights().get(2).toString();
        String expectedResult2 = FlightBuilder.createFlights().get(1).toString();
        String actualResult = Filter.noFlightOut().toString();
        assertFalse(actualResult.contains(expectedResult1));
        assertTrue(actualResult.contains(expectedResult2));
    }

    @Test
    void noDepartureAfterArrivalSeg() {
        String expectedResult1 = FlightBuilder.createFlights().get(3).toString();
        String expectedResult2 = FlightBuilder.createFlights().get(1).toString();
        String actualResult = Filter.noDepartureAfterArrivalSeg().toString();
        assertFalse(actualResult.contains(expectedResult1));
        assertTrue(actualResult.contains(expectedResult2));
    }

    @Test
    void noLandingLessTwoHours() {
        String expectedResult1 = FlightBuilder.createFlights().get(4).toString();
        String expectedResult2 = FlightBuilder.createFlights().get(1).toString();
        String actualResult = Filter.noLandingLessTwoHours().toString();
        assertFalse(actualResult.contains(expectedResult1));
        assertTrue(actualResult.contains(expectedResult2));
    }
}