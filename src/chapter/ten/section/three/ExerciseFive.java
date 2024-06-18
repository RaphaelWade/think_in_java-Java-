/*
    问题：创建一个包含内部类的类，在另一个独立的类中，创建此内部类的实例。
 */
package chapter.ten.section.three;

public class ExerciseFive {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.printHello();
    }
}

class OuterClass {
    class InnerClass {
        void printHello() {
            System.out.println("Hello, this is inner class!");
        }
    }
}
/*
输出：
    Hello, this is inner class!

 */