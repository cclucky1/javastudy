package day01.demo06.VarArgs;
/*
    可变参数：是JDk1.5之后出现的新特性
    使用前提：
        当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
    使用格式：定义方法时使用
        修饰符 返回值类型 方法名(数据类型...变量名){}
    可变参数的原理：
        可变参数底层就是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些参数
        传递的参数个数，可以是0个（不传递），1，2...多个
 */
public class Demo01VarArgs {
    public static void main(String[] args) {
        int i = add(10,20,30);
        System.out.println(i);
    }

    /*
        可变参数的注意事项
            1.一个方法的参数列表，只能有一个可变参数，数据类型不同也不行
            2.如果方法的参数有多个，那么可变参数必须卸载参数列表的末尾
     */

    public static void method(){

    }

    /*
    定义计算（0~n）个整数的和的方法
    已知：计算整数的和，数据类型已经确定int
    但是参数个数不确定，不知道计算几个整数的和，就可以使用可变参数
    add();  会创建一个长度为0的数组，new int[0]
    add(10);  会创建一个长度为1的数组，存储传递过来的参数 new int[10]
    add(10，20);  会创建一个长度为2的数组，存储传递过来的参数 new int[10，20]
     */

    public static int add(int...arr){
//        System.out.println(arr);
//        //数组的长度
//        System.out.println(arr.length);
//        return 0;
        int sum = 0;//定义一个初始化的变量，记录累加求和
        //遍历数组，获取数组中的每一个元素
        for (int i : arr) {
            sum +=i;
        }
        return sum;
    }

//    //定义一个方法，计算两个int类型整数的和
//    public static int add(int a,int b){
//        return a+b;
//    }

//    //定义一个方法，计算三个int类型整数的和
//    public static int add(int a,int b,int c){
//        return a+b+c;
//    }
}
