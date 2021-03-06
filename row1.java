package com.company;

import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

public class row1 {

    public static double row11(double m, double k) {
        if (k < 0 || k >= 30) {
            throw new IllegalArgumentException("param a = " + k);
        }
        double i, total = 0;
        for (i = 1; i <= k; i++)
            total = total + sin(m*i)*sqrt(m/i);

        return total;
    }

}
