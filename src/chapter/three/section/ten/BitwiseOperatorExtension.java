/*
    补充自P49：
        我们将布尔类型作为一种单比特值对待，所以它多少有些独特。我们可对它执行按位“与”
        、按位“或”和按位“异或”运算，但不能执行按位“非”（大概是为了避免与逻辑NOT混淆）。
        对于布尔值，按位操作符具有与逻辑操作符相同的效果，只是它们不会中途“短路”。
 */
package chapter.three.section.ten;

/**
 * @author Raphael Cha
 */
public class BitwiseOperatorExtension {
    public static void main(String[] args) {
        boolean testA = true;
        boolean testB = false;

        // 测试“与”、“或”、“异或”与布尔类型之间的运算。
        System.out.println(testA & testB);
        System.out.println(testA | testB);
        System.out.println(testA ^ testB);
        System.out.println();

        // 测试在按位运算中是否会出现短路现象。
        boolean test = test1() & test2() & test3();
        System.out.println("test = " + test);


        /*
        总结：
            1.对于布尔值，“与”、“或”、“异或”运算符与逻辑运算符具有相同的效果。
            2.对于布尔值，在按位运算中不会出现短路现象。
         */
    }

    static boolean test1() {
        System.out.println("调用了test1()方法。");
        return true;
    }

    static boolean test2() {
        System.out.println("调用了test2()方法。");
        return false;
    }

    static boolean test3() {
        System.out.println("调用了test3()方法。");
        return true;
    }
}
/*
    输出：
        false
        true
        true

        调用了test1()方法。
        调用了test2()方法。
        调用了test3()方法。
        test = false
 */