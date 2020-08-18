package List;

import java.util.LinkedList;

/*
    java.util.linked集合 implements List接口
    LinkedList集合的特点
        1.底层是一个链表结构：查询慢，增删快
        2.里边包含了大量操作首尾元素的方法
        注意：使用LinkedList集合特有的方法，不能使用多态
 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("C");
        linked.add("C");
        linked.add("C");
        linked.add("C");
        linked.add("h");
        linked.add("e");
        linked.add("n");

        System.out.println(linked);

        /*
                for循环遍历ArrayList
        for (int i = 0; i < linked.size(); i++) {
            String s = linked.get(i);
            System.out.println(s);
        }

        使用迭代器遍历Array List
        Iterator<String> s = linked.iterator();
        while (s.hasNext()){
            String next = s.next();
            System.out.println(next);
        }
         */

//        public void addFirst(E e):将指定元素插入此列表的开头
        linked.addFirst("是");
        linked.addFirst("我");
        System.out.println(linked);

//        public void addLast(E e):将指定元素添加到此列表的结尾。
        linked.addLast(",");
        linked.addLast("哈");
        linked.addLast("呵");
        System.out.println(linked);

//        public void push(E e):将元素推入此列表所表示的堆栈
        linked.push("???");
        System.out.println(linked);

//        public E getFirst():返回此列表的第一个元素
        String no1 = linked.getFirst();
        System.out.println(no1);

//        public E getLast():返回此列表的最后一个元素
        String last = linked.getLast();
        System.out.println(last);

//        public E removeFirst():移除并返回此列表的第一个元素
        String f = linked.removeFirst();
        System.out.println("移除的元素:" + f);
        System.out.println(linked);

//        public E removeLast():移除并返回此列表的最后一个元素
        String l = linked.removeLast();
        System.out.println("移除的元素:" + l);
        System.out.println(linked);

//        public E pop():从此列表所表示的堆栈处弹出一个元素
        String pop = linked.pop();
        System.out.println("弹出的元素："+pop);
        System.out.println(linked);

//        public boolean isEmpty()：如果列表不包含元素，则返回true
        boolean isempty = linked.isEmpty();
        System.out.println(isempty);
    }
}
