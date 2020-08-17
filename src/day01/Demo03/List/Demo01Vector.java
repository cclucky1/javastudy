package day01.Demo03.List;

import java.util.Vector;

public class Demo01Vector {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        Vector<String> ve = new Vector<String>();
        System.out.println(ve);

        ve.add("哈");
        System.out.println(ve);
    }
}
