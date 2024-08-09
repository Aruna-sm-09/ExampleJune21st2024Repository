package com.sgtest.ReturnDemo;
/*class
{
    String dish(String d[])
    {
        return d[];
    }
}
public class DishArray {
    public static void main(String[] args) {
        Dish d=new Dish();
        String t=d.dish(new String[]{"Biriyani","Panner tikka"});
        System.out.println(t);
    }
}
*/
class demo1
{
    String[] getdishitem()
    {
        String s[]={"Idly","Dosa","Biriyani"};
        return s;
    }
}
public class DishArray{
    public static void main(String[] args) {
        demo1 o=new demo1();
        String dishes[]=o.getdishitem();
        //if sout(dishes[0])----idly //if sout(dishes)-----location
        for(String val : dishes)
        {
            System.out.println(val);
        }
    }
}
