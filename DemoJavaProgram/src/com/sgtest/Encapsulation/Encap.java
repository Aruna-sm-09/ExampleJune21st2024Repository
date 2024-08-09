package com.sgtest.Encapsulation;
class EncapsulationDemo
{
    private int accountNo;
    private String AccHolderName;

    public int getAccountNo()
    {
        return accountNo;
    }

    public void setAccountNo(int accountNo)
    {
        this.accountNo = accountNo;
    }

    public String getAccHolderName()
    {
        return AccHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        AccHolderName = accHolderName;
    }
}
public class Encap {
    public static void main(String[] args) {
        EncapsulationDemo o=new EncapsulationDemo();
        o.setAccountNo(1100568953);
        o.setAccHolderName("Harish B");

        System.out.println("Acc Number is "+o.getAccountNo());
        System.out.println("Holder Name : "+o.getAccHolderName());

    }
}
