package com.company;

public class Main {
    public static void main(String[] args) {
        Cord cord =new Cord(15,10,5);

        Vector vector =new Vector(0);

        Mathematics mathematics =new Mathematics("Петро",10,35,57.3);


        vector.falsVect(cord,mathematics);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(cord.pyanaTohka(mathematics).getX());
        System.out.println(cord.pyanaTohka(mathematics).getY());
        System.out.println(cord.pyanaTohka(mathematics).getZ());


    }
}







