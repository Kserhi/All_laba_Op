package com.company;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n,q=1,w=1;
        System.out.println("введіть число факторіалу:");
        n=scanner.nextInt();

        for(;w<=n; w++) q*=w ;
        System.out.println(q+" for(n!)");

        while(w<=n){
            q*=w;
            w++;
        }
        System.out.println(q+" while(n!)");
    }
}
//спеціально змінив логіку