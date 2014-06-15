package com.wkuglen.Cartesian;

/**
 * Created by wkuglen.
 */
public class Line {

    private double slope;
    private Point yIntercept;
    private Point xIntercept;

    public Line() {
        slope = 0;
        yIntercept = new Point();
        xIntercept = new Point();
    }

    public Line(double slope, Point yInter) {
        this.slope = slope;
        if(yInter.getX() == 0) {
            this.yIntercept = yInter;
        }
        else {
            double tempX = yInter.getX();
            double tempY = yInter.getY();
            double b = tempY - slope*tempX;
            this.yIntercept = new Point(0.0, b);
        }
        //xIntercept
        double tempX = ( -1*this.yIntercept.getY() ) / slope;
        this.xIntercept = new Point(tempX, 0.0);
    }

    public Line(Point point1, Point point2) {
        this.slope = (point1.getY() - point2.getY()) / (point1.getX() - point2.getX());
        double b = point1.getY() - this.slope*point1.getX();
        this.yIntercept = new Point(0.0, b);
        this.xIntercept = new Point( ((-1*this.yIntercept.getY())/this.slope), 0.0);
    }

    @Override
    public String toString() {
        return "Line: " + "y = " + slope + "x + " + yIntercept.getY() + "X Intercept @ " + xIntercept;
    }
}
