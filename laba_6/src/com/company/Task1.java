package com.company;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str="";
        System.out.println("Введіть слово:");
        for (int i =0;i<5;i++){
            str=str.concat(scanner.nextLine()+" ");
            System.out.println("Введіть наступне слово:");
        }
        System.out.println("Результат: "+str);
    }
}
//спеціально змінив логіку