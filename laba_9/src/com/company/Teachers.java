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

    public Teachers() {
    }

    void present() {
        System.out.println("Вісім привіт Я " + profession + " " + name + " мені " + age + " років і моя вага становить " + weight + " кілограмів");
    }

    void test(int a) {
        Tether1 tether1 = new Tether1(a);
        tether1.test(levelSkill);
    }
    void test2(){
        Tether1 tether1 = new Tether1();
        tether1.test2();
    }
    class Tether1 {
        private int a;

        public Tether1(int a) {
            this.a = a;
        }
        public Tether1(){}

        void test(int b) {
            if (a > b) System.out.println("a>b");
            if (a < b) System.out.println("a<b");
            if (a == b) System.out.println("a==b");
        }

        void test2(){
            if (levelSkill > age) System.out.println("levelSkill > age");
            if (levelSkill < age) System.out.println("levelSkill < age");
            if (levelSkill == age) System.out.println("levelSkill == age");
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
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
