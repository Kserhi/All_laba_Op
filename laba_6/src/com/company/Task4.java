package com.company;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(a.equalsIgnoreCase(sc.next())) System.out.println(true);
        else System.out.println(false);
    }
}
