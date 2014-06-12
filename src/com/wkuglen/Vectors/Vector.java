package com.wkuglen.Vectors;

import com.wkuglen.Angles.Angle;
import com.wkuglen.Angles.Radian;

/**
 * Created by wkuglen.
 */
public class Vector {

    private double x;
    private double y;
    private Angle angle;

    public Vector()
    {
        x = 0;
        y = 0;
        angle = new Angle();
    }

    public Vector(double xComponent, double yComponent)
    {
        x = xComponent;
        y = yComponent;
        angle = new Angle( new Radian( Math.atan(y/x) ) );
    }

    public void set(double xComponent, double yComponent)
    {
        x = xComponent;
        y = yComponent;
        angle = new Angle( new Radian( Math.atan(y/x) ) );
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Angle getAngle() {
        return angle;
    }

    @Override
    public String toString() {
        return "Vector:" + "\n X Component = " + x + "\n Y Component = " + y + "\n Angle = " + angle;
    }
}
