/*
    问题：创建一个至少有一个方法的接口。在某个方法内定义一个内部类以实现此接口，
    这个方法返回对此接口的引用。
 */
package chapter.ten.section.five.exercisenine;

public class Outer {
    Information getInformation() {
        class Inner implements Information {
            private Inner() {
            }

            @Override
            public void info() {
                System.out.println("This is something about UFO!");
            }
        }
        return new Inner();
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