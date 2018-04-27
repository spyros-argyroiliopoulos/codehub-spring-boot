package com.codehub.spring.core;

public class Circle implements Shape {
    private double radius;

    @Override
    public double getArea() {
        return (radius * radius * Math.PI);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}