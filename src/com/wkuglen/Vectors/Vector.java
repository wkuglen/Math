package com.wkuglen.Vectors;

import com.wkuglen.Angles.Angle;
import com.wkuglen.Angles.Radian;

/**
 * Created by wkuglen.
 */
public class Vector {

    private double x;
    private double y;
    private double magnitude;
    private Angle angle;

    public Vector()
    {
        x = 0;
        magnitude = 0;
        y = 0;
        angle = new Angle();
    }

    public Vector(double xComponent, double yComponent)
    {
        x = xComponent;
        y = yComponent;
        magnitude = Math.sqrt( Math.pow(xComponent, 2.0) + Math.pow(yComponent, 2.0) );
        angle = new Angle( new Radian( Math.atan(y/x) ) );
    }

    public Vector add(Vector u)
    {
        return ( new Vector(this.getX()+u.getX(), this.getY()+u.getY()) );
    }
    public double dotProduct(Vector u)
    {
        return this.getX()*u.getX() + this.getY()*u.getY();
    }

    public Angle angleBetween(Vector u)
    {
        if(this.getMagnitude() != 0.0 && u.getMagnitude() != 0.0) {
            double cos0 = (this.dotProduct(u)) / (this.getMagnitude() * u.getMagnitude());
            return new Angle(new Radian(Math.acos(cos0)));
        }
        return null;
    }

    public Vector scalar(double scalar)
    {
        return new Vector( scalar*this.getX(), scalar*this.getY() );
    }

    public void set(double xComponent, double yComponent)
    {
        x = xComponent;
        y = yComponent;
        magnitude = Math.sqrt( Math.pow(xComponent, 2.0) + Math.pow(yComponent, 2.0) );
        angle = new Angle( new Radian( Math.atan(y/x) ) );
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public Angle getAngle() {
        return angle;
    }

    public String toIJ()
    {
        return "Vector: "+ x +"i + " + y + "j";
    }
    @Override
    public String toString() {
        return "Vector:" +
                "\n X Component = " + x +
                "\n Y Component = " + y +
                "\n Angle = " + angle +
                "\n Magnitude = " + magnitude;
    }
}
