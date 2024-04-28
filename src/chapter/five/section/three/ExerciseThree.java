/*
    问题：创建一个带默认构造器（即无参构造器）的类，在构造器中打印一条消息。为这个类创建一个对象。
 */
package chapter.five.section.three;

public class ExerciseThree {
    ExerciseThree() {
        System.out.println("这是无参构造器！");
    }

    public static void main(String[] args) {
        ExerciseThree test = new ExerciseThree();
    }
}
/*
输出：
    这是无参构造器！

 */