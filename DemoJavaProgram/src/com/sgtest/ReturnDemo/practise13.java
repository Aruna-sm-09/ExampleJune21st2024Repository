package com.sgtest.ReturnDemo;
class stringconcat
{
    String[] getrow(String a[][])
    {
        String s[]=new String[a.length];
        String str="";
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                s[j]=a[1][j];
                str=str+s[j];
            }
        }
        return s;
    }
}
public class practise13 {
    public static void main(String[] args) {
        stringconcat o=new stringconcat();
        String a[][]={{"App","Cup","Man"},{"cat","Rat","pen"},{"kill","hit","mat"}};
        String x[]=o.getrow(a);
        for(String yy:x)
        {
            System.out.print(yy+" ");
        }

    }

}
