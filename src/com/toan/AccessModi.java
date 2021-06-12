package com.toan;

public class AccessModi {
    private double radius;
    private String color;

    public AccessModi(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public AccessModi() {

    }

    public double getRadius() {
        return radius;
    }

    public AccessModi(double r) {
        this.radius = r;
    }

    public double getArea() {
        return this.radius * this.radius * 3.14;
    }
}



