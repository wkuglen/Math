package com.wkuglen.Matrix;

/**
 * Created by wkuglen.
 */
public class Matrix {
    private double[][] block;
    private int rows;//rows are always defined first;
    private int columns;

    public Matrix(){
        //generates a one by one matrix filled with a '0'
        block = new double[1][1];
        block[1][1] = 0;
        rows = 1;
        columns = 1;
    }
}
