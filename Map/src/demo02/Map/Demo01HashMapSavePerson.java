package demo02.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的:
        作为key的元素,必须重写hashCode方法和equals方法,以保证key唯一
 */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show01();
        show02();
    }

    /*
        HashMap存储自定义类型兼职
        key:String类型(重写了hashCode方法和equals方法,以保证key是唯一的)
        value:Person
            value可以重复(同名同年龄的人可以重复)
     */
    private static void show01() {
        HashMap<String, Person> map = new HashMap<>();
        map.put("山东", new Person("张三", 11));
        map.put("四川", new Person("李四", 17));
        map.put("云南", new Person("王五", 17));
        map.put("山东", new Person("赵六", 17));

        //使用keySet 增强for遍历Map集合
        Set<String> set = map.keySet();
        for (String s : set) {
            Person value = map.get(s);
            System.out.println("key:" + s + " value:" + value);
        }
    }

    /*
        HashMap存储自定义类型键值
        key:Person类型(必须重写hashCode和equals方法以保证key唯一)
        value:String (可以重复)
     */
    private static void show02() {
        //创建HashMap集合
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("张三", 11), "山东");
        map.put(new Person("李四", 12), "甲米");
        map.put(new Person("王五", 13), "四川");
        map.put(new Person("张三", 12), "成都");

        //使用entrySet和增强for遍历
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            String value = entry.getValue();
            Person key = entry.getKey();
            System.out.println("key:" + key + " value:" + value);
        }
    }
}
