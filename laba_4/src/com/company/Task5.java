package com.company;

public class Task5 {
    public static void main(String[] args) {
        int ten1,sek1,ten2,sek2,nam;
        nam =1 ;//томущо є 00:00  шоб неробити лишні ітерації
        for (int h = 1; h <= 24; h++){
            ten1=h/10;//десятки
            sek1=h%10;//одиниці
            for (int s = 1; s <= 60; s++){
                ten2=s/10; //десь
                sek2=s%10; //один
                if(ten1==sek2 & ten2==sek1){
                    //System.out.println(ten1+""+sek1+":"+ten2+""+sek2);
                    nam++;
                }
            }
        }
        System.out.println("кількість співпадінь:"+nam);
    }
}

