package com.sgtest.ClassAssignment;
class Animals {
    String name = "Lion";
    String type = "Wild";
    String color = "Yellowish White";
    String Goddess= "Durga Devi";
    Animals() {
        System.out.println("Animal Details");
        System.out.println("Name" + name);
        System.out.println("Type of it: " + type);
        System.out.println("Colour is " + color);
        System.out.println("Goddess of" + Goddess);
    }
}
class Aquatic
{
    String name = "Crocodile";
    String type = "Amphibians";
    String color = "Ash";
    String ls="10 Years";
    Aquatic()
    {
        System.out.println("Aquatic Animal Details");
        System.out.println("Name" + name);
        System.out.println("Type of it: " + type);
        System.out.println("Colour is " + color);
        System.out.println("Life Span :" + ls);

    }

}

public class Demo3 {
    public static void main(String[] args) {
        Animals Al = new Animals();
        Aquatic Aq = new Aquatic();
    }
}
