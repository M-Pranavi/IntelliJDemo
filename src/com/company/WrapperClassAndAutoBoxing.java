package com.company;
public class WrapperClassAndAutoBoxing {
    public static void main(String[] args)
    {
        int i = 5;//primitive datatype
        Integer ii = new Integer(i);//Boxing or Wrapping
        int j = ii.intValue();//Unboxing or Unwrapping
        Integer value = i;//AutoBoxing or AutoWrapping
        int k = value;//AutoUnboxing or AutoUnwrapping
    }
}
