package com.zwei.memory.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Collections6 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("ABC", 14);
        map.put("Milan", 123);
        map.put("Paris", 234);

        System.out.println(map.get("Milan"));
        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
        map.put("Paris", 567);
        System.out.println(map.get("Paris"));
        System.out.println();

        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("ABC", 14);
        map2.put("Milan", 123);
        map2.put("Paris", 234);

        System.out.println(map2.get("Milan"));
        for (Map.Entry<String, Integer> entry : map2.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
        System.out.println();

        Map<String, Integer> map3 = new LinkedHashMap<>();
        map3.put("ABC", 14);
        map3.put("Milan", 123);
        map3.put("Paris", 234);

        System.out.println(map3.get("Milan"));
        for (Map.Entry<String, Integer> entry : map3.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
        System.out.println();
    }
}

