package com.wkuglen.Main;

import com.wkuglen.Angles.Degree;
import com.wkuglen.Angles.Radian;
import com.wkuglen.Angles.Angle;
import com.wkuglen.Cartesian3D.Point3D;
import com.wkuglen.Cartesian3D.Vector3D;
import com.wkuglen.Equations.EulerMethod;
import com.wkuglen.Vectors.UnitVector;
import com.wkuglen.Vectors.Vector;

/**
 * Created by wkuglen.
 */
public class Driver {

    public static void main(String[] args)
    {
	// write your code here
        //===Equations===
        System.out.println("===Testing Euler's Method===");
        System.out.println(
                EulerMethod.printPoints(1,8,0.5,9,0.2,-0.3,0.3)
        );
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

        v.set(2.0, 1.0);
        System.out.println("Altered "+v);

        UnitVector u = new UnitVector( new Angle(new Degree(45.0)) );
        System.out.println("Unit "+u);

        Vector w = v.add(u);
        System.out.println("Added "+w);

        Vector scaled = v.scalar(2.0);
        System.out.println("From "+v.toIJ()+" to Scaled(2) "+scaled.toIJ());
        System.out.println("From "+u.toIJ()+" to Scaled(Unit) "+u.scalar(2.0).toIJ());//should do nothing

        System.out.println("The three vectors:"+"\n v "+v.toIJ() + "\n u "+u.toIJ() + "\n w "+w.toIJ());
        System.out.println("Dot Product of u and v: "+v.dotProduct(u));
        System.out.println("Angle Between v and u: "+v.angleBetween(u));

        //===3D Systems===
        System.out.println("===3D Systems===");
        Vector3D v3D = new Vector3D(1.0,1.0,1.0);
        Vector3D scaled3D = v3D.scalar(2.0);
        Point3D point = new Point3D(4.0,4.0,4.0);
        Vector3D u3D = new Vector3D(point);

        System.out.println(v3D);
        System.out.println(scaled3D);
        System.out.println(u3D);

        point.setX(3.0);
        point.setY(3.0);
        point.setZ(3.0);
        System.out.println(v3D.toIJK());
        System.out.println(u3D.toIJK());


    }
}
