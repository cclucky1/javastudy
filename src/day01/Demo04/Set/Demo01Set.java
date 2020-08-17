package day01.Demo04.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    java.util.Set接口 extends Collection接口
    Set接口的特点：
        1.不允许存储重复的元素
        2.没有索引，没有带索引的方法，不能使用普通的for循环遍历

    java.util.HashSet集合 implements Set接口
    HashSet特点：
        1.不允许存储重复的元素
        2.没有索引，没有带索引的方法，不能使用普通的for循环遍历
        3.是一个无序的集合，存储元素和取出元素的顺序有可能不一致
        4.底层是一个哈希表结构（查询的速度非常快）
 */
public class Demo01Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("debug");
        set.add("the");
        set.add("world");

        //使用迭代器遍历
        System.out.println("======使用迭代器遍历Set集合======");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        //使用增强for遍历
        System.out.println("======使用增强for遍历Set集合======");
        for (String s : set) {
            System.out.println(set);
        }

        //判断Set集合是否为空
        if (set.isEmpty() == false){
            System.out.println("集合不为空");
        }else {
            System.out.println("集合为空");
        }
    }
}
