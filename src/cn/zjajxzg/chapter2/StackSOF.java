package cn.zjajxzg.chapter2;

/**
 * 单线程下 只会栈溢出
 * StackOverFlowError
 *
 * VM options -Xss128k 一个虚拟机栈的容量
 * @author zhigang.xu
 */
public class StackSOF {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        StackSOF stackSOF = new StackSOF();
        try {
            stackSOF.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + stackSOF.stackLength);
            throw e;
        }
    }
}
