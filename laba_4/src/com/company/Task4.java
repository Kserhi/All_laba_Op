package com.company;

public class Task4 {
    public static void main(String[] args) {
        int n,x,i;
        n= 6;//введіть чило факторіалу
        x=1;
        i=1;
        for(;i<=n; i++) x*=i ;
        System.out.println(x+" for");

        x=1;
        i=1;
        while(i<=n){
            x*=i;
            i++;
        }
        System.out.println(x+" while");
    }
}