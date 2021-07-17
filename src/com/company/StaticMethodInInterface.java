package com.company;

interface xyz
{
    void abc();
    static void show()
    {
        System.out.println("hi");
    }
}

public class StaticMethodInInterface {
    public static void main(String[] args)
    {
        xyz.show();
    }
}
