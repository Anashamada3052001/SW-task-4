package com.company;

public class Circle extends Shape {
    private  double         radius_;
    protected static double  PI = 3.14;

    Circle (double radius, int color) {
        super (color);
        radius_ = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius_=" + radius_ +
                '}';
    }

    public double getArea () {
        return PI * radius_ * radius_;
    }
}
