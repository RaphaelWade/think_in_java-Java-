/*
    问题：修改练习1，使得Outer类包含一个private String域（由构造器初始化），而
    Inner包含一个显示这个域的toString()方法。创建一个Inner类型的对象并显示它。
 */
package chapter.ten.section.two.exercisethree;

public class Outer {
    private String testString;

    Outer(String tmp) {
        testString = tmp;
    }

    class Inner {
        @Override
        public String toString() {
            return testString;
        }
    }

    Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer("Bye!");
        Inner inner = outer.getInner();
        System.out.println(inner.toString());
    }
}
/*
输出：
    Bye!

 */