package demo01.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author CCCChen on 2020-08-21 02:29.
 * Throwable 类是 Java 语言中所有错误或异常的超类
 * Exception:编译器异常,进行编译(写代码)时Java程序出现的问题
 * RuntimeException:运行期异常,Java程序运行过程中出现的问题
 * 异常就相当于程序出了一个小毛病,处理异常后程序可以继续执行
 * <p>
 * Error:错误
 * 相当于无法治愈的毛病,必须修改源代码才能继续执行
 */
public class Demo01Exception {
    public static void main(String[] args) {
        //Exception 编译期异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("1999-1015");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        System.out.println("后续");

        System.out.println("========分割线========");

        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);

        System.out.println(obj);

        int s = 6;
        try {
            //可能会出现异常的代码
            System.out.println(obj.get(s));
        } catch (Exception e) {
            //异常的处理逻辑
            for (int i = obj.size(); i < s; i++) {
                obj.add(9);
            }
            System.out.println(obj);
        }

        //Error : OutOfMemoryError: Java heap space 内存溢出,超过给JVM分配的内存 必须修改源代码
        int[]arr = new int[1024*1024*1024];
        System.out.println("end");
    }
}
