package com.company;

import java.util.Scanner;

//Ctrl + Alt + L # formating text
public class Main {
    public static void main(String[] args) {
        Cord cord = new Cord(1, 2, 3);
        Cord cord1 = new Cord(1, 2);
        Cord cord2 = new Cord(cord);
        Cord cord3 = new Cord(32);
        Cord cord4 = new Cord();
        /////////////////////////////////////////
        Vector vector = new Vector(1, 2, 3);
        Vector vector1 = new Vector(1);
        Vector vector2 = new Vector(vector);
        Vector vector3 = new Vector();
        ////////////////////////////////////////
        Teachers teachers = new Teachers(12, "Програміст", "petor", 134, 75);
        Teachers teachers1 = new Teachers(12, "petor", 134, 75);
        Teachers teachers2 = new Teachers();
        ////////////////////////////////////////
        Mathematics mathematics = new Mathematics(12, "andriu", 33, 242);
        Mathematics mathematics1 = new Mathematics();
        ////////////////////////////////////////
        System.out.println("POINT");
        cord.present();
        System.out.println(cord.distanceFoPoint(cord1));
        System.out.println("pynaTohka");
        System.out.println(cord.pyanaTohka(mathematics).getX());
        System.out.println(cord.pyanaTohka(mathematics).getY());
        System.out.println(cord.pyanaTohka(mathematics).getZ());
        System.out.println();
        cord.vectorAp(10);
        cord.cordAp(10);
        cord1.present();
        cord2.present();
        cord3.present();
        cord4.present();
        ////////////////////////////////////////
        System.out.println("VECTOR");
        vector.present();
        vector.vectorAp(10);
        vector.vectorAp(10.0);
        System.out.println(Vector.vectorAbs(vector));
        ///
        System.out.println("falseVector");
        vector.falsVect(cord,mathematics);
        System.out.println("endFalseVecotor");
        ///
        vector1.present();
        vector2.present();
        vector3.present();
        ////////////////////////////////////////
        System.out.println("TEACHERS");
        teachers.present();
        teachers1.present();
        teachers2.present();
        ////////////////////////////////////////
        System.out.println("MATHEMATICS");
        mathematics.present();
        mathematics1.present();
        System.out.println(mathematics.distance(vector, cord, cord1));
        System.out.println(mathematics1.distance(vector, cord, cord1));
        ////////////////////////////////////////
        System.out.println("TEACHERS1");
        teachers.test(10);
        teachers.test2();

    }

}







