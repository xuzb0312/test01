package com.xu.list;

import com.xu.Collection.Student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo01 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Student s1 = new Student("zhs", 223);
        Student s2 = new Student("sdasf", 2112);
        Student s3 = new Student("xczx", 111);

        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);
        System.out.println(linkedList.size());

//        linkedList.remove(s1);
//        System.out.println(linkedList.size());

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        for (Object o : linkedList) {
            System.out.println(o);
        }
        System.out.println("--------迭代器-------");
        Iterator iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------迭代器2---------");
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        System.out.println(linkedList.contains(s1));
        System.out.println(linkedList.isEmpty());
    }
}
