package com.codehub.spring.core;

import java.util.ArrayList;

public class AreaManager {
    public double calculateArea(ArrayList<Shape> shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        return area;
    }
}