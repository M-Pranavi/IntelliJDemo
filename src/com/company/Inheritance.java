package com.company;

class Calculator
{
    public int add(int i, int j)
    {
        return i + j;
    }
}
class CalcAdv extends Calculator
{
    public int sub(int i, int j)
    {
        return i - j;
    }
}
class CalcVeryAdv extends CalcAdv
{
    public int multi(int i, int j)
    {
        return i * j;
    }
}
public class Inheritance {

    public static void main(String[] args)
    {
        CalcVeryAdv c1 = new CalcVeryAdv();
        int result1 = c1.add(4,4);
        CalcVeryAdv c2 = new CalcVeryAdv();
        int result2 = c2.sub(6,3);
        CalcVeryAdv c3 = new CalcVeryAdv();
        int result3 = c3.multi(2,3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
