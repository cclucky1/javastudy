package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点：
        底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序），保证元素有序
 */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Lucky");
        set1.add("abc");
        set1.add("abc");
        set1.add("CCCChen");

        System.out.println(set1);//[abc, CCCChen, Lucky] 无序的 不允许存储重复的元素

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Lucky");
        set2.add("abc");
        set2.add("abc");
        set2.add("CCCChen");

        System.out.println(set2);//[Lucky, abc, CCCChen] 有序的 不允许存储重复的元素

        //使用迭代器遍历
        System.out.println("=====使用迭代器遍历Set1=====");
        Iterator<String> s1 = set1.iterator();
        while (s1.hasNext()){
            String next1 = s1.next();
            System.out.println(next1);
        }

        //使用增强for循环遍历
        System.out.println("=====使用增强for循环遍历Set1=====");
        for (String s : set1) {
            System.out.println(s);
        }
    }
}
