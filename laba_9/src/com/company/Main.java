package com.company;

public class Main {
    public static void main(String[] args) {
        Cord cord =new Cord(15,3,1);
        Cord cord1 =new Cord(21,10);
        Cord cord2 =new Cord(cord1);
        Cord cord3=new Cord(1);


        Vector vector =new Vector(15,0,6);


        Mathematics mathematics =new Mathematics("Петро",4,35,57.3);

        System.out.println(cord.distanceFoPoint(cord1));
        System.out.println(cord.distanceFoPoint(21,10,0));

        vector.vectorAp(1);
        vector.vectorAp(1.2);


        mathematics.present();
        mathematics.present(10);

        cord.present();

        vector.present();
    }
}







