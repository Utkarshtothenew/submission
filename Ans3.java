package com.tothenew;

import java.util.HashMap;
import java.util.Map;

public class Ans3 {
    public static void main(String[] args) {
        printOccur("aabbccddeef");
    }
    public static void printOccur(String string){
        char[] chars = string.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<chars.length;i++){
            if (map.containsKey(chars[i])) {
                map.put(chars[i],map.get(chars[i])+1);
            } else {
                map.put(chars[i],1);
            }
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
