package demo01.Map;

import java.util.HashMap;
import java.util.Map;

/*
    java.util.Map<k,v>集合
    Map集合的特点:
        1.Map集合是一个双列集合,一个元素包含两个值(一个key,一个value)
        2.Map集合中的元素,key和value的数据类型可以相同也可以不同
        3.Map集合中的元素,key是不允许重复的,value是可以重复的
        4.Map集合中的元素,key和value是一一对应的
    java.utils.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合的特点:
        1.HashMap集合底层是哈希表:查询速度特别快
            jdk1.8之前:数组+单向链表组成
            jdk1.8之后:数组+单向链表/红黑树(链表的长度超过8):提高查询速度
        2.HashMap集合是一个无序的集合,存储元素和去除元素的顺序有可能不一致
    java.utils.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
    LinkedHashMap的特点:
        1.LinkedHashMap集合底层是哈希表+链表
        2.LinkedHashMap集合是一个有序的集合,存储元素和取出元素的顺序是一致的
 */
public class Demo01Map {
    public static void main(String[] args) {
//        show01();
//        show02();
//        show03();
        show04();
    }


    /*
        public V put(K key, V value):把指定的键与指定的值添加到Map集合中
            返回值:v
                存储键值对的时候,key不重复,返回值v是null
                存储键值对的时候,key重复,会使用新的value替换map中重复的value,返回被替换的value值
     */
    private static void show01() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "CCCChen");
        map.put("2", "CC");
        map.put("3", "CC-Lucky");

        System.out.println(map);
        System.out.println(map.get("3"));
    }

    /*
        public V remove(Object key):把指定的键 所对应的键值对元素,在Map集合中删除,返回被删除元素的值
            返回值:V
                key存在,v返回删除的值
                key不存在,v返回null
     */
    private static void show02() {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("qqqqq", 1);
        map.put("wwwww", 2);
        map.put("eeeee", 3);
        map.put("rrrrr", 4);

        Integer v1 = map.remove("rrrrr");//删除为rrrrr的key
        System.out.println("v1:" + v1);//返回被删除的值 4

        Integer v2 = map.remove("qwert");//删除为qwert的key
        System.out.println("v2:" + v2);//key不存在,返回null

        System.out.println(map);
    }

    /*
        public V get(Object key):根据指定的键,在Map集合中获取对应的值
            返回值:
                key存在,返回对应的value
                key不存在,返回null
     */
    private static void show03() {
        Map<String, Integer> map = new HashMap<>();
        map.put("qqqqq", 1);
        map.put("wwwww", 2);
        map.put("eeeee", 3);
        map.put("rrrrr", 4);

        System.out.println(map.get("wwwww"));//2
        System.out.println(map.get("qwert"));//null
    }

    /*
        boolean containsKey(Object key) 判断集合中是否包含指定的键
        包含返回true,不包含返回false
     */
    private static void show04() {
        Map<String, Integer> map = new HashMap<>();
        map.put("qqqqq", 1);
        map.put("wwwww", 2);
        map.put("eeeee", 3);
        map.put("rrrrr", 4);

        boolean b1 = map.containsKey("qwert");//判断集合中是否存在key qwert
        System.out.println(b1);//false

        boolean b2 = map.containsKey("wwwww");//判断集合中是否存在key wwwww
        System.out.println(b2);//true
    }
}
