package day01.demo02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoAliTime {
    public static void t2() {
        long times = 1595410809887L;
        Date date = new Date(times);
        System.out.println(date);
//输出结果：Tue Oct 07 12:04:36 CST 2014
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(date);
        System.out.println(dateString);
    }

    public static void main(String[] args) {
        DemoAliTime t = new DemoAliTime();
        t.t2();
        System.out.println(t);
    }
}
