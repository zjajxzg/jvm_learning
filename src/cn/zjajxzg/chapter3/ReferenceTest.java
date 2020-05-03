package cn.zjajxzg.chapter3;

/**
 * @author zhigang.xu
 * @date 2020/4/29 14:14
 */
public class ReferenceTest {

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;

        System.out.println("a=" + a + ", b=" + b);
        swap(a, b);
        System.out.println("a=" + a + ", b=" + b);
    }

    private static void swap(Integer a, Integer b) {
    }
}
