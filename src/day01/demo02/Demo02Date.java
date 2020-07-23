package day01.demo02;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo02();
    }

    private static void demo02() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
}
