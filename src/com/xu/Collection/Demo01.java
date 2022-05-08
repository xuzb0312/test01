package com.xu.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("苹果");
        collection.add("狗");
        collection.add("猫");
        System.out.println("一个有"+collection.size());
        System.out.println("-----------for----------");
        for (Object o : collection) {
            System.out.println(o);
        }
        Iterator iterator = collection.iterator();//迭代器
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }


    }
}
