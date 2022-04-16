package com.company;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String a,b;
        System.out.println("Введіть перше");
        a= scanner.nextLine();
        System.out.println("Введіть друге");
        b= scanner.nextLine();

        if (a.length()>b.length()) System.out.println(a);
        else if (a.length()<b.length()) System.out.println(b);
        else System.out.println("a=b");
    }
}
//спеціально змінив логіку