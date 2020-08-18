package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    /*
    创建集合对象，不使用泛型
    好处：
        集合不使用泛型，默认的类型就是Object类型，可以储存任意类型的数据
    弊端：
        不安全，会引发异常
     */
    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("哈哈哈");
        list.add("1744710225");
        list.add("abcdef");
        list.add(1);
        System.out.println(list);

        //使用迭代器遍历list集合
        //获取迭代器
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);

            //使用String类特有方法length获取字符串的长度
            String s = (String) obj;
            System.out.println(s.length());//Integer cannot be cast to java.lang.String
        }
    }

    /*
        创建集合对象，使用泛型
        好处：
            1.避免了类型转换的麻烦
            2.把运行期异常提升到了编译期异常
        弊端：
            泛型是什么类型就只能存储什么类型的数据
         */
    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abcdef");

        //使用迭代器遍历List集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s + "->" + s.length());
        }
    }

}
