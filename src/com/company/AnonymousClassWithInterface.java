package com.company;

interface Abc
{
    void show();
}

public class AnonymousClassWithInterface
{
    public static void main(String[] args)
    {
        Abc obj = new Abc()
        {
            public void show()
            {
                System.out.println("I'm the best");
            }
        };
        obj.show();
    }
}
