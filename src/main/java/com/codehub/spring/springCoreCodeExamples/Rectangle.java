package com.codehub.spring.springCoreCodeExamples;

public class Rectangle implements Shape {
    private double length;
    private double height;

    @Override
    public double getArea() {
        return (length * height);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}