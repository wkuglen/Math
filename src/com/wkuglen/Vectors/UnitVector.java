package com.wkuglen.Vectors;

import com.wkuglen.Angles.Angle;

/**
 * Created by wkuglen.
 */
public class UnitVector extends Vector {

    public UnitVector()
    {
        super();
    }

    public UnitVector(Angle a)
    {
        //Hypotenuse will equal one so
        super(
                ( Math.cos(a.toRad().getAngle()) )
              ,
                ( Math.sin(a.toRad().getAngle()) )
              );
        //double h = 1;
        //double x = Math.cos(a.toRad().getAngle())/h;
        //double y = Math.sin(a.toRad().getAngle())/h;
    }
    public Vector scalar(double scalar)
    {
        //does nothing since unit vectors should always remain a unit vector
        return this;
    }

    public String toIJ(){
        return "Unit "+super.toIJ();
    }
    public String toString(){
        return "Unit "+super.toString();
    }
}
