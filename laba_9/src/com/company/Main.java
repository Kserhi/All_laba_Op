package com.company;

public class Main {
    public static void main(String[] args) {
        Cord cord =new Cord(15,3,1);
        Cord cord1 =new Cord(21,10,5);
        cord.present();
        System.out.println(cord.distanceFoPoint(cord1)+" це дистанція між точками cord i cord1");
        Vector vector =new Vector(15,0,6);
        vector.vectorAp(2);
        System.out.println("модуль вектора "+vector.vectorAbs());
        System.out.println("test");
        vector.test(1,2,3);
        System.out.println();
        Mathematics mathematics =new Mathematics(34,76.4,"Петро");
        mathematics.present();
        System.out.println(mathematics.distance(vector,cord1,cord)+" відстань від точки до прямої");

    }
}







