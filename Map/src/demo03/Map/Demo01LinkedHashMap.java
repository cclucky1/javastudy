package demo03.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/*
    java.util.LinkedHashMap<K,V> extends HashMap<K,V>
    Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序(有序)
    底层原理:
        哈希表+链表(记录元素的顺序)
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("d","d");
        map.put("b","b");
        System.out.println(map);//key不允许重复,无序

        LinkedHashMap<String,String> linked = new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("c","c");
        linked.put("d","d");
        linked.put("b","b");

        Iterator<Map.Entry<String, String>> iterator = linked.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
