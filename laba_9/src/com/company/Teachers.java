package com.company;

public class Teachers {
    private int levelSkill;
    private String profession;
    private String name;
    private int age;
    private double weight;

    public Teachers(int levelSkill, String profession, String name, int age, double weight) {
        this.levelSkill = levelSkill;
        this.profession = profession;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Teachers(int levelSkill, String name, int age, double weight) {
        this.levelSkill = levelSkill;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Teachers(){}

    void present(){
        System.out.println("Вісім привіт Я "+profession+" "+name+" мені "+age+" років і моя вага становить "+weight+" кілограмів");
    }






































    public int getLevelSkill() {
        return levelSkill;
    }
    public String getProfession() {
        return profession;
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
    public void setLevelSkill(int levelSkill) {
        this.levelSkill = levelSkill;
    }
    public void setProfession(String profession) {
        this.profession = profession;
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
}
