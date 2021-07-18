package com.company;

class M
{
    public void show()
    {
        System.out.println("in M");
    }
}
class N extends M
{
    public void show()
    {
        System.out.println("in N");
    }
}
class O extends M
{
    public void show()
    {
        System.out.println("in O");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args)
    {
        M obj = new N();
        obj.show();

        obj = new O();
        obj.show();
    }
}
