package com.company;

public class Mathematics {
    String name;
    int age;
    double weight;
    int levelSkill;

    public Mathematics(String name,int levelSkill , int age, double weight) {
        this.name = name;
        this.levelSkill=levelSkill;
        this.age = age;
        this.weight = weight;
    }


    //перевизначиний і превантажений
    void present(){//статине імя динамічна логіка
        System.out.println("Вісім привіт Я математик "+name+" мені "+age+" років і моя вага становить "+weight+" кілограмів");
    }
    void present(int x){//статине імя динамічна логіка (перевизначено)
        System.out.println("Вісім привіт Я математик "+name+" мені "+(age+x)+" років і моя вага становить "+weight+" кілограмів");
    }




    double distance(Vector vector,Cord M0,Cord M1){//приймає напрямний вектор і точну яка належить прямій
        Vector vector1=new Vector(M1.x-M0.x, M1.y-M0.y, M1.z-M0.z);//по формулі вектор "м0м1"
        //наступна лінійка веторний добуток напрямного вектора і "м0м1"
        Vector vector2=new Vector(vector1.y*vector.z - vector1.z*vector.y,-1*(vector1.x* vector.z-vector1.z* vector.x),vector1.x* vector.y-vector1.y*vector.x);
        return vector2.vectorAbs()/vector.vectorAbs();// ну із формули треба поділити модуль першого на модуль напрямного
    }

}


