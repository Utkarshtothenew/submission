package com.tothenew;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ans1 {
    public static void main(String[] args) {
        List<Float> list = new ArrayList<>();
        list.add(1.5f);
        list.add(7.5f);
        list.add(1.7f);
        list.add(3.5f);
        list.add(2.5f);

        Iterator iterator = list.iterator();
        float store = 0f;
        float result = 0f;

        while (iterator.hasNext()){
            store = (float) iterator.next();
            result = result + store;
        }
        System.out.println(result);

    }
}
