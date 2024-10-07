package com.gridnine.testing;

public class Main {
    public static void main(String[] args) {
        System.out.println(Filter.noFilter());
        System.out.println(Filter.noFlightOut());
        System.out.println(Filter.noDepartureAfterArrivalSeg());
        System.out.println(Filter.noLandingLessTwoHours());
    }
}
