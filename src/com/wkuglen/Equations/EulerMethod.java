package com.wkuglen.Equations;

/**
 * Created by wkuglen.
 */
public class EulerMethod {

    public static String printPoints(double Xinit, double Yinit, double step, double Xmax,
                                     double Xconstant_deriv, double Yconstant_deriv, double Constant_deriv) {
        String toReturn = "Euler's Method \n";
        double calc_derivative;
        do {
            toReturn += "(" + Xinit + ", " + Yinit + ") ";
            calc_derivative = derivative(Xinit,Yinit,Xconstant_deriv,Yconstant_deriv,Constant_deriv);
            Yinit = Yinit + (step * calc_derivative);
            Xinit = Xinit + step;
            toReturn += "Derivative: " + calc_derivative + " ";
            toReturn += "(" + Xinit + ", " + Yinit + ") \n";
        }while(Xinit < Xmax);
        toReturn += "(" + Xinit + ", " + Yinit + ") ";
        return toReturn;
    }

    private static double derivative(double X, double Y,
                                     double Xconstant, double Yconstant, double Constant) {
        return (Xconstant * X) + (Yconstant * Y) + Constant;
    }
}
