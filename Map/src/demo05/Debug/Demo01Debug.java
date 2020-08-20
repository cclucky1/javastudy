package demo05.Debug;

/*
    Debug调试程序:
        可以让代码逐行执行,查看代码执行的过程,调试程序中出现的bug
    使用方式:
        在行号的右边,鼠标左键单击,添加断点(每一个方法的第一行,哪里有bug添加到哪里)
        右键选择debug执行程序
        程序会停留在添加的第一个断点处
    执行程序:
        f8:逐行执行程序
        f7:进入到方法中
        shift+f8:跳出方法
        f9:跳到下一个断点,如果没有下一个断点就技术程序
        Ctrl+f2:退出debug,停止程序
        Console:切换到控制台
 */
public class Demo01Debug {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int sum = a + b;
        System.out.println(sum);
    }
}
