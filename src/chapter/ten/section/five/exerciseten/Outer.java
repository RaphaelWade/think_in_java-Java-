/*
    问题：重复前一个练习，但将内部类定义在某个方法的一个作用域内。
 */
package chapter.ten.section.five.exerciseten;

public class Outer {
    Information getInformation(boolean b) {
        if (b) {
            class Inner implements Information {
                private Inner() {
                }

                @Override
                public void info() {
                    System.out.println("This is something about UFO!");
                }
            }
            Inner inner = new Inner(); // 此处没有超出类的作用范围，因此仍可以调用私有构造器。
            return inner;
        }
        return new Information() {
            @Override
            public void info() {
                System.out.println("没有成功创建普通内部类！");
            }
        };
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Information information = outer.getInformation(true);
        information.info();
    }
}
/*
输出：
    This is something about UFO!

 */