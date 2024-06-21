/*
    问题：确定外部类是否可以访问其内部类的private元素。
 */
package chapter.ten.section.four.exerciseeight;

public class OuterClass {
    // 以下被注释的内容无法通过编译。

//    private String outerField = innerField;
//
//    private void outerMethod() {
//        innerMethod();
//    }

    class InnerClass {
        private String innerField;

        private void innerMethod() {

        }
    }
}
/*
    总结：外部类不可以访问其内部类的private元素。
 */