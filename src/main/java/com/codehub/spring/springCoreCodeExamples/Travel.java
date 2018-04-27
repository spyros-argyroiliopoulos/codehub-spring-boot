package com.codehub.spring.springCoreCodeExamples;

import com.codehub.spring.springCoreCodeExamples.vehicle.Vehicle;

public class Travel {

    Vehicle myVehicle;

    public void setV(Vehicle givenVehicle) {
        myVehicle = givenVehicle;
    }


    public void startJourney() {
        myVehicle.start();
    }

}
