package com.wkuglen.Cartesian3D;

/**
 * Created by wkuglen.
 */
public class Line3D {
    //line is classified by two points on the line
    private Point3D point1;
    private Point3D point2;

    public Line3D(Point3D a, Point3D b)
    {
        point1 = a;
        point2 = b;
    }

    public double length()
    {
        return point1.distanceTo(point2);
    }
    public double distanceToPoint(Point3D desired)
    {
        /**http://mathworld.wolfram.com/Point-LineDistance3-Dimensional.html
         *|(desired - start) x (desired - end)| / |end - start|
         */
        Vector3D one = new Vector3D(point1, desired);
        Vector3D two = new Vector3D(point2, desired);
        Vector3D cross = one.crossProduct(two);
        Vector3D denominator = new Vector3D(point1, point2);
        return cross.getMagnitude() / denominator.getMagnitude();
    }
}
