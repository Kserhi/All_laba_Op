package com.company;

import java.util.Random;

class Cord extends Vector {

    public Cord(double x, double y, double z) {
        super(x, y, z);
    }


    Cord(double x, double y) {
        super(x, y, (x + y) / 2);
    }

    public Cord(double lend) {
        super(lend);
    }

    public Cord(Vector vector) {
        super(vector);
    }

    public Cord() {
    }

    void present() {//статине імя динамічна логіка
        System.out.println("Привіт я точка з кординатами:(" + getX() + ";" + getY() + ";" + getZ() + ")");
    }


    double distanceFoPoint(Cord point1) {//відстань до точки
        return Math.sqrt(Math.pow(getX() - point1.getX(), 2) + Math.pow(getY() - point1.getY(), 2) + Math.pow(getZ() - point1.getZ(), 2));
    }


    Cord pyanaTohka(Mathematics mathematics) {

        Random random = new Random();
        Cord cord = new Cord(getX(), getY());

        cord.setX(getX() + (random.nextDouble() * 10 - 5) / mathematics.getLevelSkill());
        cord.setY(getY() + (random.nextDouble() * 10 - 5) / mathematics.getLevelSkill());
        cord.setZ(getZ() + (random.nextDouble() * 10 - 5) / mathematics.getLevelSkill());

        return cord;
    }

    void cordAp(double n) {
        super.vectorAp(n);
    }
}
