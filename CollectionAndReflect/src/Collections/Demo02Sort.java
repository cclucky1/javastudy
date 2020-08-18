package Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
    java.utils.Collections是集合工具类,用来对集合进行操作.部分方法如下:
        public static <T> void sort(List<T> list):将集合中元素按照默认规则排序

    注意:
        sort(List<T> list)使用前提:
        被排序的集合里边存储的元素,必须实现实现Comparable,重写接口中的方法compareTo定义排序的规则

    Comparable接口的排序规则:
        自己(this) - 参数:升序
 */

public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
//        for (int i = 0; i < 7; i++) {
//            list01.add(i);
//        }
//        list01.remove(0);

        list01.add(2);
        list01.add(9);
        list01.add(6);
        list01.add(5);

//        public static <T> void sort(List<T> list)：将集合中元素按照默认规则排序
        Collections.sort(list01);

        System.out.println(list01);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("d");
        list02.add("c");
        System.out.println(list02);
        Collections.sort(list02);
        System.out.println(list02);

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("CCCChen",21));
        list03.add(new Person("Cc",18));
        list03.add(new Person("你猜",20));

        Collections.sort(list03);
        System.out.println(list03);
    }
}
