package day01.demo07.Collections;

import java.util.ArrayList;
import java.util.Collections;

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

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("CCCChen",21));
        list03.add(new Person("Cc",18));

        Collections.sort(list03);

    }
}
