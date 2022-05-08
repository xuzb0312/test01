package com.xu.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* collection的使用
* */
public class Demo02 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();

        Student s1 = new Student("zhangsan", 22);
        Student s2 = new Student("qwe", 221);
        Student s3 = new Student("sd", 2221);
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);

        System.out.println(collection.toString());

        for (Object o : collection) {
            System.out.println(o);
        }

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }

        System.out.println(collection.contains(s1));
        System.out.println(collection.isEmpty());

    }
}
