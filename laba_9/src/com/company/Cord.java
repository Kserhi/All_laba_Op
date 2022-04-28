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
    public Cord(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Cord(Cord cord) {
        this.x = cord.x;
        this.y = cord.y;
        this.z=cord.z;
    }
    public Cord(double lend){
        this.x=this.y=this.z=lend;
    }





    void present(){//статине імя динамічна логіка
        System.out.println("Привіт я точка з кординатами:("+x+";"+y+";"+z+")");
    }



    double distanceFoPoint(Cord point1){//відстань до точки
        return Math.sqrt(Math.pow(x-point1.x,2)+Math.pow(y-point1.y,2)+Math.pow(z-point1.z,2));
    }
    double distanceFoPoint(double x1,double y1,double z1){//відстань до точки
        return Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2)+Math.pow(z-z1,2));
    }

}
