package day01.demo02.Collection;
/*
含有泛型的接口，第一种使用方式：
    定义接口的实现类，实现接口，指定接口的泛型
    public interface Iterator<E>{
        E next();
    }

    Scanner类实现了Iterator接口，并指定接口的泛型为String，所以重写next方法，泛型默认是String

    public final class Scanner implements Iterator<String>{

    }
 */
public class GenericInterfaceImpl1 implements GenericInterface<String>{

    @Override
    public void method01(String s) {
        System.out.println(s);
    }
}
