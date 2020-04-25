package cn.zjajxzg.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行时常量池OOM
 *
 * jdk1.6 常量池在老年代 会报OOM permGen space
 *
 * @author zhigang.xu
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        // 使用list保持着常量池引用，避免Full GC回收常量池行为
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
