package demo03.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/*
    练习:
        计算一个字符串中每个字符出现的次数

    分析:
        1.使用Scanner获取用户输入的字符串
        2.创建一个Map集合,key是字符串中的字符,value是字符的个数
        3.遍历字符串获取每一个字符
        4.使用获取到的字符,去Map集合判断key是否存在
            key存在:
                通过字符(key),获取value(字符个数)
                value++
                put(key,value)把新的value存储到Map集合中
            key不存在:
            put(key,1)
        5.遍历Map集合,输出结果
 */
public class Demo03MapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串:");
        String s = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();
        //使用获取到的字符,去Map集合判断key是否存在
        for (char c : s.toCharArray()) {
            /*key存在:
            通过字符(key),获取value(字符个数)
            value++
            put(key,value)把新的value存储到Map集合中*/
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value++;
                map.put(c, value);
                /*key不存在:
                put(key,1) */
            } else {
                map.put(c, 1);
            }
        }
        //遍历Map集合,输出结果
        Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
