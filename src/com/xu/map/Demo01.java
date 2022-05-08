package com.xu.map;

import java.util.HashMap;
import java.util.Map;

/*
* map的使用
* */
public class Demo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("cn","中国");
        map.put("uk","应该");
        map.put("usa","没国");

        System.out.println(map.size());
        System.out.println(map.toString());

        System.out.println("--------keyset------------");

        for (String s : map.keySet()) {
            System.out.println(s+"    "+map.get(s));
        }
        System.out.println("-------entryset---------");
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.getKey()+"  "+stringStringEntry.getValue());
        }

        System.out.println(map.containsKey("cn"));
        System.out.println(map.isEmpty());

    }
}
