

package edu.berkeley.aep;

// Understands a four-sided figure with four right angles
public class Rectangle {

    public final double length;
    public final double width;

    public static Rectangle createSquare(double side) {
        return new Rectangle(side, side);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    protected double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * length + 2 * width;
    }


}
