package com.company;

import java.util.ArrayList;
import java.util.List;

public class CollectionAndGenericsListInterface {
    public static void main(String[] args) {
        List values = new ArrayList();
        values.add(4);
        values.add(6);
        values.add(9);
        values.add(2, 3);

        for (int i=0; i<values.size(); i++)
        {
            System.out.println(values.get(i));
        }
    }
}