package com.company;

public class Son extends Father{

    private int height;

    public Son(String name, int age) {
        super(name, age);
    }

    public Son(int height){
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void Print() {
        //super.Print();
        System.out.println("Son's Height = " + height);
    }
}
