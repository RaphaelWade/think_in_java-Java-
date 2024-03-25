/*
    问题：修改前一个练习，将DataOnly中的数据在main()方法中赋值并打印出来。
 */
package chapter.two.section.eleven;

public class ExerciseFive {
    public static void main(String[] args) {
        DataOnly data = new DataOnly();

        data.i = 47;
        data.d = 1.1;
        data.b = false;

        System.out.println("data.i = " + data.i);
        System.out.println("data.d = " + data.d);
        System.out.println("data.b = " + data.b);
    }
}