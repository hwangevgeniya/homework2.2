package com.company;

public class Main {

    public String className;

    public static void main(String[] args) {
	// write your code here

        /*Son son = new Son(185);
        Daughter1 daughter1 = new Daughter1(60);
        Daughter2 daughter2 = new Daughter2("Student");

        son.Print();
        daughter1.Print();
        daughter2.Print();*/

        /*CreateObject("Son");
        CreateObject("Daughter1");
        CreateObject("Daughter2");*/

       /* Son son = new Son(CreateObject("className"));
        son = className;

        Printable printable = new Printable() {
            @Override
            public void Print() {
                son.Print();
            }
        }*/

        Son son = (Son) CreateObject("Son");
        Daughter1 daughter1 = (Daughter1) CreateObject("Daughter1");
        Daughter2 daughter2 = (Daughter2) CreateObject("Daughter2");

        Printable[] printables = new Printable[]{son,daughter1,daughter2};

        for (int i = 0; i < printables.length; i++) {

            printables[i].Print();
            
        }

    }

    public static Printable CreateObject(String className){

        switch (className){

            case "Son":
                Son son = new Son(185);
                //son.Print();
                System.out.println(son);
                return son;
                //break;

            case "Daughter1":
                Daughter1 daughter1 = new Daughter1(60);
                return daughter1;
                //daughter1.Print();
                //break;

            case "Daughter2":
                Daughter2 daughter2 = new Daughter2("Student");
                return daughter2;
                //daughter2.Print();
                //break;
        }

        //return className;
        return null;
    }




}
