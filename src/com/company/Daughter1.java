package com.company;

public class Daughter1 extends Father{

    private int weight;

    public Daughter1(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }

    public Daughter1(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void Print() {
        //super.Print();
        System.out.println("Daughter's weight = " + weight);
    }
}
