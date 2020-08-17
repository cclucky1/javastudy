package day01.Demo04.Set;

import java.util.HashSet;

/*
    HashSet存储自定义类型元素

    set集合报错元素唯一：
        存储的元素（String,Integer,...Student,Person...）必须重写hashCode方法和equals方法

    要求：
        同年龄同名的人，视为同一个人，只能存储一次
 */
public class Demo01HashSetSavePerson {
    public static void main(String[] args) {
        //创建HashSet集合存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("CCCChen",21);
        Person p2 = new Person("CCCChen",21);
        Person p3 = new Person("CCCChen",18);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));

        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println(set);
    }
}
