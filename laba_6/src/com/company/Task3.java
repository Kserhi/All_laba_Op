package com.company;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, min;
        System.out.print("Введіть перше дробове число: ");


        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
            System.out.print("Введіть друге дробове число: ");
            if (sc.hasNextDouble()) {
                b = sc.nextDouble();
                System.out.print("Введіть третє дробове число: ");
                if (sc.hasNextDouble()) {
                    c = sc.nextDouble();
                    if (a <= b && a <= c) {
                        min = a;
                    } else if (b <= a && b <= c) {
                        min = b;
                    } else {
                        min = c;
                    }
                    System.out.println(min);
                } else {
                    System.out.println("Ви ввели не дробове число");
                }
            } else {
                System.out.println("Ви ввели не дробове число");
            }
        } else {
            System.out.println("Ви ввели не дробове число");
        }
    }
}
//неміняв логіку скопіював з практичної