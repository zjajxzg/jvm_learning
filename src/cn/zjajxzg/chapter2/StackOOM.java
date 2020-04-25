package cn.zjajxzg.chapter2;

/**
 * VM options -Xss2m 一个虚拟机栈的容量
 *
 * 多线程情况下 不停的创建线程 会出现栈内存OOM
 * 操作系统给一个进程分配的内存容量时有限的 去掉堆内存、方法区等内存占用，
 * 剩下的空间就是栈内存的空间 所以不停的创建线程可以耗尽这部分内存 导致OOM
 *
 * windows下实测直接死机。。
 * linux下会报OOM unable to create new native thread
 *
 * @author zhigang.xu
 */
public class StackOOM {
    private void dontStop() {
        while (true) {

        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        StackOOM stackOOM = new StackOOM();
        stackOOM.stackLeakByThread();
    }
}
