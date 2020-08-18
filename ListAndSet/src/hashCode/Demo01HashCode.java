package hashCode;
/*
    哈希值：是一个十进制的整数，由系统随即给出（就是对象的地址值，是一个逻辑地址，是模拟出来得到地址，不是数据实际存储的物理地址）
    在Object类有一个方法，可以获取对象的哈希值
    hashCode方法的源码：
        public native int hashCode();
        native：代表该方法调用的是本地操作系统的方法
 */
public class Demo01HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);//1163157884

        Person p2= new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);//1956725890

        System.out.println(p1);//day01.demo05.hashCode.Person@4554617c
        System.out.println(p2);//day01.demo05.hashCode.Person@74a14482

        /*
        String类的哈希值
            String类重写了Object类的hashCode方法
         */
        String s1= new String("CCCChen");
        String s2 = new String("CCCChen");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
