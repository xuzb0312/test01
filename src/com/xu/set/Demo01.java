package com.xu.set;

import java.util.Comparator;
import java.util.TreeSet;

/*
* TreeSet小案例，使用字符串长度进行比较
* */
public class Demo01 {
    public static void main(String[] args) {
        TreeSet<String> objects = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n1 = o1.length()-o2.length();
                int n2 = o1.compareTo(o2);
                return n1==0?n2:n1;
            }
        });

        objects.add("xian");
        objects.add("xitian");
        objects.add("fxs1n");
        objects.add("xzzzzxxxxxxxx");
        objects.add("abcd");
        System.out.println(objects.size());
        System.out.println(objects.toString());
    }
}
