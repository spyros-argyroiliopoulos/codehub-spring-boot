package com.codehub.spring.core;

import java.util.ArrayList;

public class AreaManager {
    public double calculateArea(ArrayList<Object>... shapes) {
        double area = 0;
        for (Object shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle rect = (Rectangle)shape;
                area += (rect.getLength() * rect.getHeight());
            } else if (shape instanceof Circle) {
                Circle circle = (Circle)shape;
                area += (circle.getRadius() * circle.getRadius() * Math.PI);
            } else {
                throw new RuntimeException("Shape not supported");
            }
        }
        return area;
    }
}