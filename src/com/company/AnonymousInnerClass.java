package com.company;

class P
{
    public void show()
    {
        System.out.println("in P show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args)
    {
        P obj =  new P()
                 {
                     public void show ()
                     {
                         System.out.println("I'm the best");
                     }
                 };
        obj.show();
    }
}
