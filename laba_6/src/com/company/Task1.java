package com.company;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        String a ="";
        for (int i =0;i<5;i++) a=a.concat(s1.next()+" ");
        System.out.println(a);
    }
}
