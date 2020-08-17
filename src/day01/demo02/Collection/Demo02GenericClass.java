package day01.demo02.Collection;

public class Demo02GenericClass {
    public static void main(String[] args) {
        GenericClass gc1 = new GenericClass();
        gc1.setName("Only String");

        //创建GenericClass对象，泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);
    }
}
