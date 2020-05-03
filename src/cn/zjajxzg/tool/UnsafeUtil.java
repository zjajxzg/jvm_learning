package cn.zjajxzg.tool;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author zhigang.xu
 * @date 2020/4/29 17:08
 */
public class UnsafeUtil {
    /**
     * 反射获取Unsafe类
     *
     * @return
     */
    private static Unsafe reflectGetUnsafe() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe) field.get(null);
        } catch (Exception e) {
//            log.error(e.getMessage(), e);
            return null;
        }
    }
}
