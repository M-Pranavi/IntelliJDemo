package com.company;

import java.util.ArrayList;
import java.util.List;

public class GenericsWithList {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();
        values.add(4);
        values.add(6);
        values.add(9);

        for (Integer i=0; i<values.size(); i++)
        {
            System.out.println(values.get(i));
        }
    }
}
