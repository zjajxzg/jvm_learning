package cn.zjajxzg.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆内存OOM dump内存快照分析
 *
 * VM options -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *
 * jvisualvm.exe jdk自带工具查看内存快照
 *
 * @author zhigang.xu
 */
public class HeapOOM {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        while (true) {
            Object o = new Object();
            list.add(o);
        }
    }
}
