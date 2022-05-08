package com.xu.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo04 {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList<>();
        //1.添加元素
        Student s1=new Student("唐", 21);
        Student s2=new Student("何", 22);
        Student s3=new Student("余", 21);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        System.out.println("元素个数："+arrayList.size());
        System.out.println(arrayList.toString());

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
