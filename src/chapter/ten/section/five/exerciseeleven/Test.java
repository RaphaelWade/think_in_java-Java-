/*
    问题：创建一个private内部类，让它实现一个public接口。写一个方法，它返回一个
    指向此private内部类的实例的引用，并将此引用向上转型为该接口类型。通过尝试向下转型，
    说明此内部类被完全隐藏了。
 */
package chapter.ten.section.five.exerciseeleven;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();

//        Outer.Inner inner2 = (Outer.Inner)outer.getInformation();
        /*
        此处会出现编译错误，因为Inner内部类具有private权限，无法被Outer类之外被访问。
        也就是说，此内部类被完全隐藏了。
         */
    }
}
