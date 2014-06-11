package com.wkuglen.Main;

import com.wkuglen.Angles.Degree;
import com.wkuglen.Angles.Radian;
import com.wkuglen.Angles.Angle;

/**
 * Created by wkuglen.
 */
public class Driver {

    public static void main(String[] args)
    {
	// write your code here
        //===angles===
        System.err.println("Testing Angles");
        Degree d = new Degree(30.00);
        System.out.println(d);
        Radian r = new Radian(Math.PI/6);
        System.out.println(r);
        Angle one = new Angle(d);
        Angle two = new Angle(r);
        System.out.println("One: "+one+"\n"+"Two: "+two);
    }
}
