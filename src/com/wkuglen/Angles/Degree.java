package com.wkuglen.Angles;

/**
 * Created by wkuglen.
 */
public class Degree {

    private double angleMeasure;

    /**
     * Default Constructor
     */
    public Degree()
    {
        angleMeasure = Constants.zero.toDeg().getAngle();
    }

    /**
     * Defined Constructor
     * @param angle sets the number of degrees in an angle
     */
    public Degree(double angle)
    {
        int i = 1;
        while(angle >= 360)
        {
            angle = angle - i*360;
            i++;
        }
        angleMeasure = angle;
    }

    /**
     * @return angleMeasure as a double and in degrees
     */
    public double getAngle() {
        return angleMeasure;
    }

    /**
     * @param deg resets the number of degrees in an angle
     */
    public void setAngle(double deg)
    {
        int i = 1;
        while(deg >= 360)
        {
            deg = deg - i*360;
            i++;
        }
        angleMeasure = deg;
    }

    @Override
    public String toString() {
        return angleMeasure + " degrees";
    }
}
