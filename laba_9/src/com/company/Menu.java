package com.company;

import java.util.Scanner;

public class Menu {
    static final int MENU=0;
    static final int PREZENT=1;



    static void menu(){
        Scanner scanner =new Scanner(System.in);
        int n;
        System.out.println("ГОЛОВНЕ МЕНЮ");
        System.out.println("Шо я за програма натисніть: 1");
        System.out.println("Дати завдання натисніть: 2");
        System.out.println("ВВЕДІТЬ:");
        n=scanner.nextInt();

        if((n<0)||(n>2)){
            do {
                System.out.println("некоректні дані спробуйте щераз");
                n=scanner.nextInt();
            }while((n<0)&(n>2));
        }
        switch (n){
            case MENU -> Menu.menu();
            case PREZENT -> Menu.menu();
        }


    }
    static void setPrezent(){
        System.out.println("Привіт я програмка яка імітує робото вчителів");
    }










}
