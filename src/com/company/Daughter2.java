package com.company;

public class Daughter2 extends Father{

    private String occupation;

    public Daughter2(String name, int age, String occupation) {
        super(name, age);
        this.occupation = occupation;
    }

    public Daughter2(String occupation){
        this.occupation = occupation;
    }


    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public void Print() {
        //super.Print();
        System.out.println("Daughter's occupation = " + occupation);
    }
}
