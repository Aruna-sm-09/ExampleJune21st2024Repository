package com.sgtest.Assignment;
class Fruits11
{
    String fruitname;
    String colour;
    String Vitamin;
    String Produced_in;
    Fruits11() {
        fruitname = "Apple";
        colour = "Red";
        Vitamin = "Vit C";
        Produced_in = "Kashmir";
        System.out.println("Details of the Fruit");
        System.out.println("Name:" + fruitname);
        System.out.println("Colour:" + colour);
        System.out.println("Vitamin:" + Vitamin);
        System.out.println("Grown in:" + Produced_in);
        System.out.println("---------------------------------------");
    }
}
class Flowers12
{
    String flowername;
    String colour;
    String Vitamin;
    String usedfor;
    Flowers12() {
        flowername = "Sunflower";
        colour = "Yellow";
        Vitamin = "Vit B,C,K";
        usedfor = "Extracting oil";
        System.out.println("Details of the FLowers");
        System.out.println("Name:" + flowername);
        System.out.println("Colour:" + colour);
        System.out.println("Vitamin:" + Vitamin);
        System.out.println("Useful For:" + usedfor);
        System.out.println("---------------------------------------");
    }
}
class Vegetable13
    {
    String vegname;
    String colour;
    String Vitamin;
    Vegetable13() {
        vegname = "Potato";
        colour = "Russet";
        Vitamin = "Vit A";
        System.out.println("Details of the Vegetable");
        System.out.println("Name:" + vegname);
        System.out.println("Colour:" + colour);
        System.out.println("Vitamin:" + Vitamin);
    }
}


public class NoArgs_Things {

    public static void main(String[] args) {
        Fruits11 f1=new Fruits11();

        Flowers12 f2=new Flowers12();


        Vegetable13 V1=new Vegetable13();
        V1.vegname="Potato";
        V1.colour="Russet";
        V1.Vitamin="Vit A";
        System.out.println("Details of the Vegetable");
        System.out.println("Name:"+ V1.vegname);
        System.out.println("Colour:"+ V1.colour);
        System.out.println("Vitamin:"+ V1.Vitamin);
    }

}
