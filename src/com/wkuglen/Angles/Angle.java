package com.wkuglen.Angles;

/**
 * Created by wkuglen.
 */
public class Angle {

    private Radian measureR;
    private Degree measureD;

    /**
     * Default Constructor
     */
    public Angle()
    {
        measureR = new Radian();
        measureD = new Degree();
    }

    /**
     * Defined Constructor - Radians
     * @param rad an angle measured in radians
     */
    public Angle(Radian rad)
    {
        measureR = rad;
        measureD = new Degree(rad.getAngle()*180/Math.PI);
    }

    /**
     * Defined Constructor - Degrees
     * @param deg an angle measure in degrees
     */
    public Angle(Degree deg)
    {
        measureD = deg;
        measureR = new Radian(deg.getAngle()*Math.PI/180);
    }

    /**
     * @return the angle as a Radian object
     */
    public Radian toRad() {
        return measureR;
    }

    /**
     * @return the angle as a Degree object
     */
    public Degree toDeg() {
        return measureD;
    }

    /**
     * @param rad resets the angle based on the inputed radian
     */
    public void setMeasure(Radian rad) {
        measureR = rad;
        measureD = new Degree(rad.getAngle()*180/Math.PI);
    }

    /**
     * @param deg resets the angle based on the inputed degree
     */
    public void setMeasure(Degree deg) {
        measureD = deg;
        measureR = new Radian(deg.getAngle()*Math.PI/180);
    }

    @Override
    public String toString() {
        return measureD.toString() + ", " + measureR.toString();
    }
}
