package demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合遍历的第二种方式:使用Entry对象遍历

    Map集合中的方法:
        Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的Set视图
    实现步骤:
    1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
    2.遍历Set集合,获取每一个Entry对象
    3.使用Entry对象中的方法getKey()和getValue()获取键与值
 */
public class Demo03EntrySet {
    public static void main(String[] args) {
        //创建Map集合
        Map<String, Integer> map = new HashMap<>();
        map.put("十四岁", 160);
        map.put("十六岁", 170);
        map.put("十八岁", 175);
        map.put("二十岁", 177);

        //使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        //遍历Set集合,获取每一个Entry对象

        System.out.println("========使用迭代器遍历========");

        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> next = it.next();

            //使用Entry对象中的方法getKey()和getValue()获取键与值
            String key = next.getKey();
            Integer value = next.getValue();

            System.out.println("年龄:" + key + " 身高:" + value);
        }

        System.out.println("========使用增强for遍历========");

        for (Map.Entry<String, Integer> next : set) {
            String key = next.getKey();
            Integer value = next.getValue();

            System.out.println("年龄:" + key + " 身高:" + value);
        }
    }
}
