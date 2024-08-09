package com.sgtest.Polymorphism;
abstract class Landuse
{
    abstract void Usage();

}
class Residential extends Landuse
{
    @Override
    void Usage() {
        System.out.println("Land is Used for Housing");
    }
}
class Commercial extends Landuse
{
    @Override
    void Usage() {
        System.out.println("Land is used for Business");
    }
}
class Agricultural extends Landuse
{
    @Override
    void Usage() {
        System.out.println("Land is Used for Farming");
    }
}
public class PolyAssgn2 {
    public static void main(String[] args) {
      Landuse land=null;
      Residential res=new Residential();
      Commercial com=new Commercial();
      Agricultural agri=new Agricultural();

      land=res;
      land.Usage();
      land=com;
      land.Usage();
      land=agri;
      land.Usage();


    }
}



















//Landuse[] landuse=new Landuse[3];
//landuse[0]=new Residential();
//landuse[1]=new Commercial();
//landuse[2]=new Agricultural();
//        for(Landuse printlanduse:landuse)
//        {
//        //System.out.println(printlanduse);
//        printlanduse.Usage();
//        }