package com.company;

public class Cord{
    double x;
    double y;
    double z;

    public Cord(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void present(){
        System.out.println("Привіт я точка з кординатами:("+x+";"+y+";"+z+")");
    }

    double distanceFoPoint(Cord point1){//відстань до точки
        return Math.sqrt(Math.pow(x-point1.x,2)+Math.pow(y-point1.y,2)+Math.pow(z-point1.z,2));
    }


}
