package com.wkuglen.Equations;

/**
 * Created by wkuglen.
 */
public class Term {

    public static final String POWER_OF_CONCAT = "POWER ";
    public static final String SQUARE = "POWER 2";
    public static final String CUBE = "POWER 3";
    public static final String SQUARE_ROOT = "SQRT";
    public static final String CUBE_ROOT = "POWER 0.5";

    public static final String LOG_BASE_CONCAT = "LOG ";
    public static final String LOG = "LOG 10";
    public static final String LN = "LN";


    /**
     * @param constant
     * @param operation
     * @param variable
     */
    public Term(double constant, String operation, char variable) {

    }

    public Term(double constant, String operation, Term param) {

    }

    @Override
    public String toString() {
        return "Term{}";
    }
}
