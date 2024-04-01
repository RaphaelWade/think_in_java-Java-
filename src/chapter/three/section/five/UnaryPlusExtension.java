/*
    补充自p43：
        一元加号只是为了与一元减号相对应，但是它唯一的作用仅仅是将较小的类型的操作数
        提升为int。
 */
package chapter.three.section.five;

public class UnaryPlusExtension {
    public static String getType(Object var) {
        return var.getClass().toString();
    }

    public static void main(String[] args) {
        short numberA = 10;
        long numberB = 100L;

        System.out.println(getType(numberA));
        System.out.println(getType(+numberA));
        System.out.println(getType(numberB));
        System.out.println(getType(+numberB));
    }
    /*
    输出：
        class java.lang.Short
        class java.lang.Integer
        class java.lang.Long
        class java.lang.Long
     */
}
