package day01.demo01.Date;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyDate {
    public static void main(String[] args) throws ParseException {
        Scanner mybirth = new Scanner(System.in);

        System.out.println("输入出生年月日");
        String birth = mybirth.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        Date myday = sdf.parse(birth);

        long mytime = myday.getTime();
        long nowTime = System.currentTimeMillis();
        long day = (nowTime - mytime) / 1000 / 60 / 60 / 24;

        System.out.println("我已经来到这个世界" + day + "天");

//        long x = day;
//        switch (x){
//
//        }
        if (day > 3650 && day < 7300){
            System.out.println("人生还长");
        }else if (day > 7300){
            System.out.println(">20岁");
        }
    }


}
