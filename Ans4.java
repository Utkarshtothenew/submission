package com.tothenew;

import java.util.*;

public class Ans4 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("hey","e");
        map.put("hey there","d");
        map.put("hey rhtr","c");
        map.put("hey teheh","b");
        map.put("hey tehe","a");
        List<Map.Entry<String,String>> list = new LinkedList<Map.Entry<String, String>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return (o1.getValue().compareTo(o2.getValue()));
            }
        });
        HashMap<String,String> hashMap = new HashMap<>();
        for (Map.Entry<String,String> entry:list) {
            hashMap.put(entry.getKey(),entry.getValue());
        }
        for (Map.Entry<String,String> entry:hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
