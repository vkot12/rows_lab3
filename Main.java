package com.company;

import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        printResults(0, 0);
        printResults(0, 1);
        printResults(1, 0);
        printResults(1, 1);
        printResults(2, 1);
        printResults(1, 2);
        printResults(2, -10);
        printResults(20, 20);
        printResults(21, 21);
        printResults(1, 10);
        printResults(-1, 10);
        printResults(0, Double.MAX_VALUE);
        printResults(1, Double.MAX_VALUE);
        printResults(1, Double.NaN);
    }

    public static double row1(double m, double k) {
        if (k < 0 || k > 30) {
            throw new IllegalArgumentException("param k = " + k);
        }
        double i, total = 0;
        for (i = 1; i <= k; i++)
            total = total + sin(m*i)*sqrt(m/i);

        return total;
    }


   public static void printResults(double m, double k) {
        System.out.print("k:" + m + " x:" + k + " result:");
        try {
            System.out.println(row1(m, k));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }




/*
    static double sum(int m, int n)
    {
        double i, total = 0;
        for (i = 1; i <= n; i++)
            total = total + sin(m*i)*sqrt(m/i);

        return total;
    }
*/


}
