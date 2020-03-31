package edu.berkeley.aep;    // understand a four sided figure with sides at right angles

import javax.crypto.spec.RC2ParameterSpec;

public class Rectangle {
    private double width;
    private double height;
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    // getter and setter break encapsulation

    // calculate the area
    public double area(){
        return this.width*this.height;
    }

    public static Rectangle createSquare(int side){
        return new Rectangle(side, side);
    }

    @Override
    public boolean equals(Object other) {
        if(other == this) return true;
        else if(!(other instanceof Rectangle)) return false;
        return Double.compare(((Rectangle) other).width, this.width) == 0 && Double.compare(((Rectangle) other).height, this.height) == 0;
    }
}
