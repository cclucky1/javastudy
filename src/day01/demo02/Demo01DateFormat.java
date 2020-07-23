package day01.demo02;

import java.text.*;
import java.util.Date;

public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
//        System.out.println(Date.parse(1594055776201L));
        demo01();
        demo02();
    }

    private static void demo02() throws ParseException {
        SimpleDateFormat demo2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = demo2.parse("2020年07月07日 01时34分32秒");
        System.out.println(date);
    }

    private static void demo01() {
        SimpleDateFormat demo = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String d = demo.format(date);
        System.out.println(date);
        System.out.println(d);
    }
}
