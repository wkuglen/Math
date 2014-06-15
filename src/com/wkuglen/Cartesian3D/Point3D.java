package com.wkuglen.Cartesian3D;

/**
 * Created by wkuglen.
 */
public class Point3D {

    private double x;
    private double y;
    private double z;

    public Point3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Point3D(double xCoordinate, double yCoordinate, double zCoordinate) {
        x = xCoordinate;
        y = yCoordinate;
        z = zCoordinate;
    }

    public double distanceTo(Point3D other){
        double rawDistance = Math.pow( this.getX()-other.getX() , 2.0 );
        rawDistance += Math.pow( this.getY()-other.getY() , 2.0 );
        rawDistance += Math.pow( this.getZ()-other.getZ() , 2.0 );
        return Math.sqrt(rawDistance);
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D(x,y,z): " + "("+x+","+y+","+z+")";
    }
}
