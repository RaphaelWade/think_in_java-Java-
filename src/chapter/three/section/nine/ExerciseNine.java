/*
    问题：分别显示用float和double指数计数法所能表示的最大和最小的数字。
 */
package chapter.three.section.nine;

public class ExerciseNine {
    public static void main(String[] args) {
        float maxFloatNumber = Float.MAX_VALUE;
        float minFloatNumber = Float.MIN_VALUE;
        double maxDoubleNumber = Double.MAX_VALUE;
        double minDoubleNumber = Double.MIN_VALUE;

        System.out.println("maxFloatNumber = " + maxFloatNumber);
        System.out.println("minFloatNumber = " + minFloatNumber);
        System.out.println("maxDoubleNumber = " + maxDoubleNumber);
        System.out.println("minDoubleNumber = " + minDoubleNumber);
    }
}
/*
    输出：
        maxFloatNumber = 3.4028235E38
        minFloatNumber = 1.4E-45
        maxDoubleNumber = 1.7976931348623157E308
        minDoubleNumber = 4.9E-324
 */