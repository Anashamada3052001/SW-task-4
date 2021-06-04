package com.company;
public class Rectangle  extends Shape {
    private double         length_, width_;

    Rectangle (double length, double width, int color) {
        super (color);
        length_ = length;
        width_  = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length_=" + length_ +
                ", width_=" + width_ +
                '}';
    }

    public double getArea () {
        return length_ * width_;
    }
}


