package com.company;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a,b;
        System.out.println("введіть перше слово");
        a = scanner.nextLine();
        System.out.println("введіть друге слово");
        b = scanner.nextLine();
        if(a.equalsIgnoreCase (b)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
//спеціально змінив логіку