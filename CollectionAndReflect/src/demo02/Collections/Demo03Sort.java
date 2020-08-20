package demo02.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    java.utils.Collections是集合工具类,用来对集合进行操作.部分方法如下
        public static <T> void sort(List<T> list,Comparator<? super T>):将集合中元素按照指定规则排序

    Comparator和Comparable的区别
        Comparable:自己(this)和别人(参数)比较,自己需要实现Comparable接口,重写比较的规则compareTo方法
        Comparator:相当于找一个第三方的裁判来比较两个人

    Comparator的排序规则:
        o1 - o2:升序
        反之降序
 */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(2);
        list01.add(9);
        list01.add(6);
        list01.add(5);
        Collections.sort(list01, new Comparator<Integer>() {
            //重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
//                return  o1 - o2;//升序
                return o2 - o1;//降序
            }
        });
        System.out.println(list01);

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("CCCChen", 2));
        list02.add(new Student("CC", 9));
        list02.add(new Student("qqq", 6));
        list02.add(new Student("hhhh", 9));

        /*for (int i = 0; i < list02.size(); i++) {
            System.out.println(list02.get(i));
        }*/

        /*Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照年级升序排序
                return o1.getGrade() - o2.getGrade();
            }
        });*/

        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照年级升序排序
                int result = o1.getGrade() - o2.getGrade();
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        //遍历list02
        for (int i = 0; i < list02.size(); i++) {
            System.out.println(list02.get(i));
        }
    }
}
