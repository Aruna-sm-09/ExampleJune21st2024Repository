package com.sgtest.Parameter;
class Wholesaler
{
    String wname;
    String location;
    String product;
    String phno;
    Wholesaler(String wn,String loc,String prdt,String phno)
    {
        this.wname = wn;
        this.location = loc;
        this.product = prdt;
        this.phno = phno;
        System.out.println("Wholesaler Name:" + wn);
        System.out.println("Location:" + loc);
        System.out.println("Type of Product :" + prdt);
        System.out.println("Contact No:" + phno);
        System.out.println("-------------------------------------------------");
    }
}
class Retailer {
    String rname;
    String category;
    String address;
    String phno;

    Retailer(String rn, String cat, String add, String phno) {
        this.rname = rn;
        this.category = cat;
        this.address = add;
        this.phno = phno;
        System.out.println("Retailer Name:" + rn);
        System.out.println("Category of products:" + cat);
        System.out.println("Address :" + add);
        System.out.println("Contact No:" + phno);
        System.out.println("-------------------------------------------------");
    }
}
class Purchaser
{
    String pname;
    String pitem;
    String address;
    String phno;
    Purchaser(String pn,String pit,String add,String phno) {
        this.pname = pn;
        this.pitem = pit;
        this.address = add;
        this.phno = phno;
        System.out.println("Purchaser Name:" + pn);
        System.out.println("Purchased Item:" + pit);
        System.out.println("Address :" + add);
        System.out.println("Contact No:" + phno);
        System.out.println("-------------------------------------------------");
    }
}


    public class Assignment3 {
        public static void main(String[] args)
        {
            Wholesaler w1=new Wholesaler("Kiran","Ananthpur","Bangle Store","+91 80526152");
            Retailer r1=new Retailer("Punith","Fancy Store","Attiguppe,Near Shaneshwara temple","+91 805626356");
            Purchaser p1=new Purchaser("Ravi","Jewels","Chandralayout","+91 708695251");
        }
}
