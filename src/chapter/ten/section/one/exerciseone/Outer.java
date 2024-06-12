/*
    问题：编写一个名为Outer的类，它包含一个名为Inner的类。在Outer中添加一个方法，
    它返回一个Inner类型的对象。在main()中，创建并初始化一个指向某个Inner对象的引用。
 */
package chapter.ten.section.one.exerciseone;

public class Outer {
    class Inner {
        void sayHello(){
            System.out.println("Hello!This is inner class!");
        }
    }

    Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.getInner();
        inner.sayHello();
    }
}
/*
输出：
    Hello!This is inner class!

 */