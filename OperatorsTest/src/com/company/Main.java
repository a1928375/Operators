package com.company;

public class Main {

    public static void main(String[] args) {

        double a = 20.00d;

        double b = 80.00d;

        double c = (a+b)*100.00d;

        double d = c % 40.00d;

        boolean e = (d == 0);

        System.out.println(e);

        if (e != true) {
            System.out.println("Get some remainders");
        }

        
        double cc = a + b*100.00d;

        double dd = cc % 40.00d;

        boolean ee = (dd == 0);

        System.out.println(ee);

        if (ee != true) {
            System.out.println("Get some remainders");
        }
    }
}
