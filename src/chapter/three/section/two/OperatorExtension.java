/*
补充自（p39）：
    1.几乎所有的操作符都只能操作“基本类型”。
    2.例外的操作符是“=”、“==”和“!=”，这些操作符能操作所有对象。
    3.除此之外，String类支持“+”和“+=”。
 */
package chapter.three.section.two;

public class OperatorExtension {
    public static void main(String[] args) {
        // 1.基本类型
        int a = 1 + 2;
        int b = 2 - 1;
        int c = b * 2;
        int d = 1 / 2;
        System.out.printf("%d, %d, %d, %d\n", a, b, c, d); // 3, 1, 2, 0
        System.out.println();

        // 2.对象
        OperatorTest operatorTest1 = new OperatorTest();
        OperatorTest operatorTest2 = new OperatorTest();
        System.out.println(operatorTest1 == operatorTest2); // false
        System.out.println(operatorTest1 != operatorTest2); // true
        System.out.println();

        // 3.String类
        String str1 = "abc";
        String str2 = "123";
        String str3 = "";
        str3 += str2;
        System.out.println(str1 + str2);
        System.out.println(str3);
    }
}

class OperatorTest {
}