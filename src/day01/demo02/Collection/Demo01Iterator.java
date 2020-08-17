package day01.demo02.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("哈哈");
        coll.add("嘿嘿");
        coll.add("嘻嘻");


        Iterator<String> it = coll.iterator();
//        boolean hasNext = it.hasNext();
//        System.out.println(hasNext);
//
//        boolean b = it.hasNext();
//        System.out.println(b);
//        String s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
        while (it.hasNext()){
            String a = it.next();
            System.out.println(a);
        }

        System.out.println("======我是分割线======");

        for(Iterator<String> it2 = coll.iterator();it2.hasNext();){
            String e = it2.next();
            System.out.println(e);
        }

    }
}
