package com.wkuglen.Cartesian3D;

/**
 * Created by wkuglen.
 */
public class Vector3D {

    private double x;
    private double y;
    private double z;
    private double magnitude;

    public Vector3D() {
        x = 0;
        y = 0;
        z = 0;
        magnitude = 0;
    }

    public Vector3D(double xCoordinate, double yCoordinate, double zCoordinate) {
        x = xCoordinate;
        y = yCoordinate;
        z = zCoordinate;
        magnitude = new Point3D().distanceTo(new Point3D(xCoordinate, yCoordinate, zCoordinate));
    }

    public Vector3D(Point3D endPoint){
        x = endPoint.getX();
        y = endPoint.getY();
        z = endPoint.getZ();
        magnitude = new Point3D().distanceTo(endPoint);
    }

    public Vector3D(Point3D startPoint, Point3D endPoint)
    {
        x = endPoint.getX() - startPoint.getX();
        y = endPoint.getY() - startPoint.getY();
        z = endPoint.getZ() - startPoint.getZ();
        magnitude = startPoint.distanceTo(endPoint);
    }

    public void set(double xCoordinate, double yCoordinate, double zCoordinate)
    {
        x = xCoordinate;
        y = yCoordinate;
        z = zCoordinate;
        magnitude = new Point3D().distanceTo(new Point3D(xCoordinate, yCoordinate, zCoordinate));
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(this.getX() + other.getX(), this.getY() + other.getY(), this.getZ() + other.getZ());
    }

    public Vector3D scalar(double scalar){
        return new Vector3D(scalar*this.x, scalar*this.y, scalar*this.z);
    }

    public double dotProduct(Vector3D u){
        return this.getX()*u.getX() + this.getY()*u.getY() + this.getZ()*u.getZ();
    }


    /**
     * |i  j  k |
     * |vx vy vz|
     * |ux uy uz|
     * @param u the other vector in the cross product
     * @return cross product of this(v) x u
     */
    public Vector3D crossProduct(Vector3D u) {
        double i = this.getY()*u.getZ() - u.getY()*this.getZ();
        double j = this.getX()*u.getZ() - u.getX()*this.getZ();
        double k = this.getX()*u.getY() - u.getX()*this.getY();
        return new Vector3D(i,-j,k);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String toIJK() {
        return "Vector3D: " + x+"i + " + y+"j + " + z+"k";
    }

    @Override
    public String toString() {
        return "Vector3D:" +
                "\n X Component = " + x +
                "\n Y Component = " + y +
                "\n Z Component = " + z +
                "\n Magnitude   = " + magnitude;
    }
}
