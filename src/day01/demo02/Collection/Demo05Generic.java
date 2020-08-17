package day01.demo02.Collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
泛型的通配符
    ？：代表任意的数据类型
    使用方式：
    不能创建对象使用，只能作为方法的参数使用
 */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("Hello");
        list02.add("Hi");

        printArray(list01);
        printArray(list02);
    }

    /*
    定义一个方法，能遍历所有类型的ArrayList集合
    这时候我们不知道ArrayList集合使用什么数据类型，可以泛型的通配符？来接收数据类型
    Warning:
        泛型没有继承概念
     */
    public static void printArray(ArrayList<?> list) {
        //使用迭代器遍历集合
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }
    }
}
