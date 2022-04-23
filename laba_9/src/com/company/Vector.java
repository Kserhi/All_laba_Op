package com.company;

public class Vector {
    double x;
    double y;
    double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void vectorAp(int n){//просто шось робе
        System.out.println("Vector("+(x+n)+";"+(y+n)+";"+(z+n)+")");
    }
    double vectorAbs(){//модуль вектора
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
    }
    void test(int...array){//експеремент
        for(int i : array){
            x+=i;
            y+=i;
            z+=i;
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }



}
