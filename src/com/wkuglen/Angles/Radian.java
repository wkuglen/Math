package com.wkuglen.Angles;

/**
 * Created by wkuglen.
 */
public class Radian {

    private double angleMeasure;

    /**
     * Default Constructor
     */
    public Radian()
    {
        angleMeasure = Constants.zero.toRad().getAngle();
    }

    /**
     * @param angle sets the number of radians in an angle
     */
    public Radian(double angle) {
        int i = 1;
        while(angle >= 2*Math.PI)
        {
            angle = angle - 2*i*Math.PI;
            i++;
        }
        angleMeasure = angle;
    }

    /**
     * @return angleMeasure as a double in radians
     */
    public double getAngle() {
        return angleMeasure;
    }

    /**
     * @param angle resets the angle with a double
     */
    public void setAngle(double angle) {
        int i = 1;
        while(angle >= 2*Math.PI)
        {
            angle = angle - 2*i*Math.PI;
            i++;
        }
        angleMeasure = angle;
    }

    @Override
    public String toString() {
        return  angleMeasure + " radians";
    }
}
