package com.xu.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * List子接口的使用
 * 特点：有序   有下表     可以重复
 */
public class Demo03 {
    public static void main(String[] args) {
        List list =new ArrayList();
        list.add("黑社会");
        list.add("是的是的");
        list.add(0,"但撒谎");
        System.out.println("一共有"+list.size());

//        list.remove(0);//删除下标为0的元素
        System.out.println(list.toString());
        System.out.println("-------使用for循环遍历-----------");
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("------使用foreach-------");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("------使用Iterator------");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("使用List的迭代器");
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.nextIndex()+":"+listIterator.next());
        }
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previousIndex()+":"+listIterator.previous());
        }

        System.out.println(list.indexOf("黑社会"));



    }
}
