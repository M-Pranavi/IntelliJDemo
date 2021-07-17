package com.company;

class D
{
    public void show()
    {
        System.out.println("int D");
    }
}
class E
{
    public void show()
    {
        System.out.println("in E");
    }
}

public class MethodOverriding {
    public static void main(String[] args)
    {
        E obj1 = new E();
        obj1.show();
    }
}
