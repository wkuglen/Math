package com.wkuglen.Main;

import com.wkuglen.Angles.Degree;
import com.wkuglen.Angles.Radian;
import com.wkuglen.Angles.Angle;
import com.wkuglen.Vectors.UnitVector;
import com.wkuglen.Vectors.Vector;

/**
 * Created by wkuglen.
 */
public class Driver {

    public static void main(String[] args)
    {
	// write your code here
        //===angles===
        System.out.println("===Testing Angles===");
        Degree d = new Degree(30.00);
        System.out.println(d);
        Radian r = new Radian(Math.PI/6);
        System.out.println(r);
        Angle one = new Angle(d);
        Angle two = new Angle(r);
        System.out.println("One: "+one+"\n"+"Two: "+two);
        //===vectors===
        System.out.println("===Testing Vectors===");
        Vector v = new Vector();
        System.out.println("Zero "+v);
        v = new Vector(2.0, 2.0);
        System.out.println("Regular "+v);
        UnitVector u = new UnitVector( new Angle(new Degree(45.0)) );
        System.out.println("Unit "+u);
        System.out.println(Math.sqrt(2.0)/2);
    }
}
