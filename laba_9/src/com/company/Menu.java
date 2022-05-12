package com.company;

import java.util.Scanner;

public class Menu {
    static final int MENU=0;
    static final int PREZENT=1;
    static final int RAN=2;
    static final int MATHEMATICS=3;
    static final int YNIKYM=4;
    static final int KARKYLZTOR=5;
    static final int EXIT=1111;



    static void menu() {
        System.out.println("ГОЛОВНЕ МЕНЮ");
        System.out.println("Шо я за програма натисніть: 1");
        System.out.println("Дати завдання натисніть: 2");
        System.out.println("Кінець виконання програми: 1111");
        System.out.println("ВВЕДІТЬ:");

        Scanner scanner = new Scanner(System.in);
        int namber = scanner.nextInt();


        if (namber != 1 && namber != 2 && namber != EXIT) {
            do {
                System.out.println("некоректні дані спробуйте щераз");
                namber = scanner.nextInt();
            } while (namber != 1 && namber != 2 && namber != EXIT);
        }


        switch (namber){
            case PREZENT -> Menu.setPrezent();
            case RAN -> Menu.setRan();
            case EXIT -> System.out.println("Кінець виконання програми");
        }


    }



    static void setPrezent(){
        System.out.println("Привіт я програмка яка імітує робото викладачів і тому подібне");
        System.out.println();System.out.println();
        System.out.println();System.out.println();
        System.out.println("Натисни нуль щоб повернутись:");


        Scanner scanner =new Scanner(System.in);
        int namber;
        namber=scanner.nextInt();

        if(namber!=0){
            do {
                System.out.println("некоректні дані спробуйте щераз");
                namber =scanner.nextInt();
            }while(namber!=0);
        }
        Menu.menu();
    }

    static void setRan(){
        System.out.println("Кого ви хочете імітувати?");
        System.out.println("Матиматика (натисніть:"+MATHEMATICS+")");
        System.out.println("Створити свого унікума(натисніть:"+YNIKYM+")");
        System.out.println("Каркулятор (натисніть:"+KARKYLZTOR+")");

        Scanner scanner =new Scanner(System.in);
        int namber=scanner.nextInt();

        switch (namber){
            case MATHEMATICS -> {
                Mathematics mathematics=new Mathematics();

            }
        }



    }









}
