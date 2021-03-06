package com.company;

import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

public class row2 {

    public static double row22(double t, double l) {
        double i, total = 0;

        if (l < 0) {
            throw new IllegalArgumentException("param l = " + l);
        }
        if (l % 2 == 0) {
            for (i = 1; i <= l; i++)
                total = total + sqrt(t * l);
            return total;
        } else {
            for (i = 1; i <= l; i++)
                total = total + l / sqrt(t);
            return total;
        }

    }


}
