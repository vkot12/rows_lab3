/*
Лабораторна робота №3 завданнтя №1
Варіант:16
Виконали:студенти групи ТМ-81
Пономаренко Іван, Славінський Дмитро
*/
package com.company;

import static com.company.row1.row11;
import static com.company.row2.row22;
import static com.company.row3.row33;



public class Main {

    public static void main(String[] args) {

        System.out.print(" result1:" + "\n");

        printResults1(0, 0);
        printResults1(0, 1);
        printResults1(1, 0);
        printResults1(1, 1);
        printResults1(2, 1);
        printResults1(1, 2);
        printResults1(2, -10);
        printResults1(20, 20);
        printResults1(21, 21);
        printResults1(1, 10);
        printResults1(-1, 10);
        printResults1(0, Double.MAX_VALUE);
        printResults1(1, Double.MAX_VALUE);
        printResults1(1, Double.NaN);

        System.out.print(" result1:" + "\n");

        printResults2(0, 0);
        printResults2(0, 1);
        printResults2(1, 0);
        printResults2(1, 1);
        printResults2(2, 1);
        printResults2(1, 2);
        printResults2(2, -10);
        printResults2(20, 20);
        printResults2(21, 21);
        printResults2(1, 10);
        printResults2(-1, 10);
        printResults2(0, Double.MAX_VALUE);
        printResults2(1, Double.MAX_VALUE);
        printResults2(1, Double.NaN);




    }

    


   public static void printResults1(double m, double k) {
        System.out.print("a:" + m + " x:" + k + " result:");
        try {
            System.out.println(row11(m, k));

        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }


    public static void printResults2(double t, double l) {
        System.out.print("a:" + t + " x:" + l + " result:");
        try {
            System.out.println(row22(t, l));

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
