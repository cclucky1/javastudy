package demo03.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/*
    java.util.HashTable<K,V>集合 implements Map<K,V>接口

    HashTable:底层也是一个哈希表,是一个线程不安全的集合,是单线程的集合,速度慢
    HashMap:底层是一个哈希表,是一个线程不安全的集合,是多线程的集合,速度快

    HashMap集合(之前学的所有集合):可以存储null值,null键
    HashTable集合,不能存储null值,null键

    HashTable和Vector集合一样在1.2版本之后被更先进的集合(HashMap,ArrayList)取代
    HashTable的子类Properties依然活跃在历史的舞台
    Properties集合是一个唯一和IO流相结合的集合
 */
public class Demo02HashTable {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put("a",null);
        Iterator<Map.Entry<String, String>> it1 = map.entrySet().iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

        Hashtable<String,String> hmap = new Hashtable<>();
        hmap.put("s","q");
        hmap.put("w","2");
        Iterator<Map.Entry<String, String>> it2 = hmap.entrySet().iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
