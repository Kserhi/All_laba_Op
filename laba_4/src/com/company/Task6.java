package com.company;
public class Task6 {
    public static void main(String[] args) {
        int a, b, c, d, e, f,counter= 0;
        for (int i = 1; i <= 999999; i++){
            a = i / 100000;
            b = (i - a * 100000) / 10000;
            c = (i - a * 100000 - b * 10000) / 1000;
            d = (i - a * 100000 - b * 10000 - c * 1000) / 100;
            e = (i - a * 100000 - b * 10000 - c * 1000 - d * 100) / 10;
            f = i - a * 100000 - b * 10000 - c * 1000 - d * 100 - e * 10;
            if (a + b + c == d + e + f) {
                counter++;
                //System.out.println(a + "" + b + "" + c + "=" + d + "" + e + "" + f + ":" + counter);
            }
        }
        System.out.println("результат:" + counter);
    }
}
//спеціально змінив логіку