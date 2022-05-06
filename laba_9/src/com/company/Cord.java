package com.company;

import java.util.Random;

class Cord{
    private double x;
    private double y;
    private double z;


    Cord(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    Cord(double x, double y) {
        this.x = x;
        this.y = y;
        this.z=(x+y)/2;
    }
    Cord(Cord cord) {
        this.x = cord.x;
        this.y = cord.y;
        this.z = cord.z;
    }
    Cord(double lend){
        this.x=this.y=this.z=lend;
    }
    Cord(){
        this.x=this.y=this.z=0;
    }



    void present(){//статине імя динамічна логіка
        System.out.println("Привіт я точка з кординатами:("+x+";"+y+";"+z+")");
    }

    //перевизначиний
    double distanceFoPoint(Cord point1){//відстань до точки
        return Math.sqrt(Math.pow(x-point1.x,2)+Math.pow(y-point1.y,2)+Math.pow(z-point1.z,2));
    }
    double distanceFoPoint(double x1,double y1,double z1){//відстань до точки
        return Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2)+Math.pow(z-z1,2));
    }



    Cord pyanaTohka(Mathematics mathematics){

        Random random=new Random();
        Cord cord =new Cord(x,y,z);

        cord.x+=(random.nextDouble()*10-5)/mathematics.getLevelSkill();
        cord.y+=(random.nextDouble()*10-5)/mathematics.getLevelSkill();
        cord.z+=(random.nextDouble()*10-5)/mathematics.getLevelSkill();

        return cord;
    }






    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setZ(double z) {
        this.z = z;
    }


}
