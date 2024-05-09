/*
    问题：编写一个含有字符串域的类，并采用实例初始化方式进行初始化。
 */
package chapter.five.section.seven;

public class ExerciseFifteen {
    public static void main(String[] args) {
        ExerciseClass test = new ExerciseClass();

        System.out.println(test.test);
    }
}

class ExerciseClass {
    String test;
    {
        test = "hello";
    }
}
/*
输出：
    hello

 */