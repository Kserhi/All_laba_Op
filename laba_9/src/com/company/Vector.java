package com.company;
import java.util.Random;
 class Vector {
     private double x;
     private double y;
     private double z;


     Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
     Vector(double lend){
         this.x=this.y=this.z=lend;
     }
     Vector(Vector vector){
         this.x=vector.getX();
         this.y=vector.getY();
         this.z=vector.getZ();
     }
     Vector(){}



    //перевизначиний
    void vectorAp(int n){//просто шось робе
        System.out.println("Vector("+(x+n)+";"+(y+n)+";"+(z+n)+")");
    }
    void vectorAp(double n){//просто шось робе 2
        System.out.println("Vector("+(x+n)+";"+(y+n)+";"+(z+n)+")");
    }

    void present(){//статине імя динамічна логіка
        System.out.println("Привіт я вектор з кординатами:("+x+";"+y+";"+z+")");
    }


    static double vectorAbs(Vector vector){//модуль вектора
        return Math.sqrt(Math.pow(vector.getX(), 2)+Math.pow(vector.getY(), 2)+Math.pow(vector.getZ(), 2));
    }


     void falsVect(Cord cord,Mathematics mathematics ){//експеремент
        Random random=new Random();
        double x1=x,y1=y,z1=z;

        x1+=(random.nextDouble()*10-5)/mathematics.getLevelSkill();
        y1+=(random.nextDouble()*10-5)/mathematics.getLevelSkill();
        z1+=(random.nextDouble()*10-5)/mathematics.getLevelSkill();

        System.out.println(x1+cord.getX());
        System.out.println(y1+cord.getY());
        System.out.println(z1+cord.getZ());

    }














     public double getX() {return x;
     }
     public double getY() {return y;
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
