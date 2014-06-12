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
}
