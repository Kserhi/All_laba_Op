package com.company;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String a= sc.next(),b= sc.next();
        if (a.length()>b.length()) System.out.println(a);
        else if (a.length()<b.length()) System.out.println(b);
        else System.out.println("a=b");
    }
}
