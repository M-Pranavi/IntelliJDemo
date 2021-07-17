package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionAndGenerics {
    public static void main(String[] args)
    {
        Collection values = new ArrayList();
        values.add(4);
        values.add(6);
        values.add(9);

        System.out.println(values);
    }
}
