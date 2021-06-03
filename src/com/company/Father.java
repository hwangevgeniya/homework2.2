package com.company;

public class Father implements Printable{

    private String name;
    private int age;

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Father() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void Print() {
        System.out.println("Параметры : " + name + " " + age);
    }
}
