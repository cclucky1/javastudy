package demo01.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>();
        System.out.println(coll);//重写了toString方法 []

        boolean b1 = coll.add(19991015);
        System.out.println("b1:" + b1);//b1:true
        System.out.println(coll);//[19991015]

        Collection<String> haha = new ArrayList<>();
        System.out.println(haha);

        //向集合中添加元素
        boolean c1 = haha.add("哈哈");
        haha.add("呵呵");
        haha.add("嘿嘿");
        haha.add("嘻嘻");
        System.out.println("c1：" + c1);
        System.out.println(haha);

        //删除集合中的某个元素
        boolean d1 = haha.remove("");
        haha.remove("嘻嘻");
        haha.remove("???");
        System.out.println(d1);
        System.out.println(haha);

        //判断集合中是否存在某个元素
        boolean e1 = haha.contains("哈哈");
        if (e1 == false) {
            System.out.println("不存在");
        } else {
            System.out.println("success!");
        }

        //public boolean is Empty()
        //判断集合是否为空
        Collection<Integer> collection = new ArrayList<>();
        System.out.println(collection);
        collection.add(1);
//        collection.remove(1);
        boolean isempty = collection.isEmpty();
        if (isempty == false) {
            System.out.println("不为空");
        } else {
            System.out.println("Empty！");
        }

        //public int size()
        //判断集合长度
        int size = haha.size();
        System.out.println(size);

        //public Pbject[] toArray()
        //把集合中的元素储存在数组中
        Object[] arr = haha.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //public void clear()
        //清空集合中的所有元素但是不删除集合
        Collection<String> zuan = new ArrayList<>();
        System.out.println(zuan);
        zuan.add("cnm");
        zuan.add("sb");
        zuan.add("wdnmd");
        System.out.println(zuan);
        zuan.clear();
        System.out.println(zuan);
    }
}
