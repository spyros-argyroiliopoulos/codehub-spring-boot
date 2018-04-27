package com.codehub.spring.core;

import com.codehub.spring.core.vehicle.Vehicle;

public class Travel {

    Vehicle myVehicle;

    public void setV(Vehicle givenVehicle) {
        myVehicle = givenVehicle;
    }


    public void startJourney() {
        myVehicle.start();
    }

}
