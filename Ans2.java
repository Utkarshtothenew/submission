package com.tothenew;

import java.util.HashMap;
import java.util.Map;


public class Ans2 {
    public static void main(String[] args) {
        System.out.println(uniqueChars("aabbcd"));
    }

    public static int uniqueChars(String string) {
        char[] chars = string.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<chars.length;i++){
            if (map.containsKey(chars[i])) {
                map.put(chars[i],map.get(chars[i])+1);
            } else {
                map.put(chars[i],1);
            }
        }
        int counter=0;
        for (Map.Entry<Character,Integer> entry:map.entrySet()) {
            if (entry.getValue() > 1){
                counter++;
            }
        }
        return counter;
    }
}
