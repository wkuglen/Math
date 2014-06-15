package com.wkuglen.Cartesian;

/**
 * Created by wkuglen.
 */
public class Point {

    public static final Point origin = new Point();

    private double x;
    private double y;

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public Point(double xCoordinate, double yCoordinate) {
        x = xCoordinate;
        y = yCoordinate;
    }

    public double distanceTo(Point other) {
        return Math.sqrt( Math.pow(this.getX()-other.getX(), 2.0) -
                          Math.pow(this.getY()-other.getY(), 2.0)  );
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point: " + "(" + x + ", " + y + ")";
    }
}
