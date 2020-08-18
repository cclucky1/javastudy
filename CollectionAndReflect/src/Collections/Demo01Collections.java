package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
    java.util.Collections是集合工具类，用来对集合进行操作。部分方法如下
        public static <T> boolean addAll(Collection<T> c, T...elements) 往集合中添加一些元素
        public static void shuffle(List<?> List)    打乱顺序：打乱集合顺序
 */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //往集合中添加多个元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

//        public static <T> boolean addAll(Collection<T> c, T...elements) 往集合中添加一些元素
        Collections.addAll(list,"q","w","e","r");

//        public static void shuffle(List<?> List)    打乱顺序：打乱集合顺序
        Collections.shuffle(list);


        //使用迭代器遍历集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
    }
}
