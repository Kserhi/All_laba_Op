package com.company;

class Mathematics {
    private String name;
    private int age;
    private double weight;
    private int levelSkill;

    Mathematics(String name,int levelSkill , int age, double weight) {
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
        Vector vector1=new Vector(M1.getX()-M0.getX(), M1.getY()-M0.getY(), M1.getZ()-M0.getZ());//по формулі вектор "м0м1"
        //наступна лінійка веторний добуток напрямного вектора і "м0м1"
        Vector vector2=new Vector(vector1.getY()*vector.getZ() - vector1.getZ()*vector.getY(),-1*(vector1.getX()* vector.getZ()-vector1.getZ()* vector.getX()),vector1.getX()* vector.getY()-vector1.getY()*vector.getX());
        return vector2.vectorAbs()/vector.vectorAbs();// ну із формули треба поділити модуль першого на модуль напрямного
    }














    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
    public int getLevelSkill() {
        return levelSkill;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setLevelSkill(int levelSkill) {
        this.levelSkill = levelSkill;
    }
}



