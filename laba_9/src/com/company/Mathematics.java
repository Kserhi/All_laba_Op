package com.company;
import java.util.Scanner;
class Mathematics extends Teachers{

    public Mathematics(int levelSkill,String name, int age, double weight) {
        super(levelSkill, name, age, weight);
        setProfession("Матиматик(чка)");
    }
    Mathematics(){}

    void inicializacia(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ведіть імя");
        setName(scanner.nextLine());
        System.out.println("ведіть вік");
        setAge(scanner.nextInt());
        System.out.println("рівень знань");
        setLevelSkill(scanner.nextInt());
        System.out.println("вага");
        setWeight(scanner.nextDouble());
    }

    static void aVoid(Mathematics mathematics){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Лінію задаєм напрямним вектором і точкою");
        System.out.println("Ведіть кординати вектора через ентер");
        double x=scanner.nextDouble(),y=scanner.nextDouble(),z= scanner.nextDouble();
        Vector vector = new Vector(x,y,z);
        System.out.println("Точка яка належить лінії");
        x=scanner.nextDouble();
        y=scanner.nextDouble();
        z= scanner.nextDouble();
        Cord cord =new Cord(x,y,z);
        System.out.println("Точка до якої вимірюєм відстань");
        x=scanner.nextDouble();
        y=scanner.nextDouble();
        z= scanner.nextDouble();
        Cord cord1 =new Cord(x,y,z);
        System.out.println("Результат");
        System.out.println(mathematics.distance(vector,cord,cord1));
    }




    double distance(Vector vector, Cord M0, Cord M1){//приймає напрямний вектор і точну яка належить прямій
        Vector vector1=new Vector(M1.getX()-M0.getX(), M1.getY()-M0.getY(), M1.getZ()-M0.getZ());//по формулі вектор "м0м1"
        //наступна лінійка веторний добуток напрямного вектора і "м0м1"
        Vector vector2=new Vector(vector1.getY()*vector.getZ() - vector1.getZ()*vector.getY(),-1*(vector1.getX()* vector.getZ()-vector1.getZ()* vector.getX()),vector1.getX()* vector.getY()-vector1.getY()*vector.getX());
        return vector2.vectorAbs()/vector.vectorAbs();// ну із формули треба поділити модуль першого на модуль напрямного
    }







}



