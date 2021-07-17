package com.company;

interface Abcd
{
    void show();
}

public class FunctionalInterface {
    public static void main(String[] args)
    {
        Abc obj = () -> System.out.println("I'm the best");
        obj.show();
    }
}
