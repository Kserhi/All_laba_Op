package com.company;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String a="",b;
        for (int i =0;i<5;i++){
            b=scanner.nextLine();
            b=b.substring(0,1);
            a=a.concat(b+" ");
        }
        System.out.println(a);
    }
}
//спеціально змінив логіку