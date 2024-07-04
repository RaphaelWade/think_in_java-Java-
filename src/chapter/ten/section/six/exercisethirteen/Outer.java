/*
    问题：重复练习9，这次使用匿名内部类。
 */
package chapter.ten.section.six.exercisethirteen;

public class Outer {
    Information getInformation() {
        return new Information() {

            @Override
            public void info() {
                System.out.println("This is something about UFO!");
            }
        };
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Information information = outer.getInformation();
        information.info();
    }
}
/*
输出：
    This is something about UFO!

 */