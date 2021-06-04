package com.company;

public class Square extends Shape {
    private double         length_;

    @Override
    public String toString() {
        return "Square{" +
                "length_=" + length_ +
                '}';
    }

    Square (double length, int color) {
        super (color);
        length_ = length;

    }

    public double getArea () {
        return length_ * length_;
    }
}

