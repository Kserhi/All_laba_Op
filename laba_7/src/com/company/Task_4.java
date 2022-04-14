package com.company;
import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String randomStr="";
        for (int i=0;i<3;i++){ //стрінгою подаєм 3 рандомні числа
            randomStr=randomStr.concat(String.valueOf( (int)(Math.random() * 3)+1));
        }
        System.out.println(randomStr);//сапрощуєм життя
        for (int p=0;p<2;p++){//реалузуєм 2 спроби
            if(randomStr.equals(scanner.nextLine())){//порівнюєм рандомне з введеним
                System.out.println("молодець");
                break;
            }else System.out.println("зле");
        }
    }
}
