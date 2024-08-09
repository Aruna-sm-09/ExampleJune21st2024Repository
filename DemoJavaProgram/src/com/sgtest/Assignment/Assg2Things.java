package com.sgtest.Assignment;

class Fruits
{
    String fruitname;
    String colour;
    String Vitamin;
    String Produced_in;
}
class Flowers
{
    String flowername;
    String colour;
    String Vitamin;
    String usedfor;
}
class Vegetable
{
    String vegname;
    String colour;
    String Vitamin;
}
public class Assg2Things {
    public static void main(String[] args) {
        Fruits f1=new Fruits();
        f1.fruitname="Apple";
        f1.colour="Red";
        f1.Vitamin="Vit C";
        f1.Produced_in="Kashmir";
        System.out.println("Details of the Fruit");
        System.out.println("Name:"+f1.fruitname);
        System.out.println("Colour:"+f1.colour);
        System.out.println("Vitamin:"+f1.Vitamin);
        System.out.println("Grown in:"+f1.Produced_in);
        System.out.println("---------------------------------------");

        Flowers f2=new Flowers();
        f2.flowername="Sunflower";
        f2.colour="Yellow";
        f2.Vitamin="Vit B,C,K";
        f2.usedfor="Extracting oil";
        System.out.println("Details of the FLowers");
        System.out.println("Name:"+f2.flowername);
        System.out.println("Colour:"+f2.colour);
        System.out.println("Vitamin:"+f2.Vitamin);
        System.out.println("Useful For:"+f2.usedfor);
        System.out.println("---------------------------------------");

        Vegetable V1=new Vegetable();
        V1.vegname="Potato";
        V1.colour="Russet";
        V1.Vitamin="Vit A";
        System.out.println("Details of the Vegetable");
        System.out.println("Name:"+ V1.vegname);
        System.out.println("Colour:"+ V1.colour);
        System.out.println("Vitamin:"+ V1.Vitamin);
    }
}
