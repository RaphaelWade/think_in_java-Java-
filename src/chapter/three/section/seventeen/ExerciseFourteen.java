/*
    问题：编写一个接受两个字符串参数的方法，用各种布尔值的比较关系来比较这两个字符串
    ，然后把结果打印出来。做==和!=比较的同时，用equals()作测试。在main()里面用几个
    不同的字符串对象调用这个方法。
 */
package chapter.three.section.seventeen;

/**
 * @author Raphael Cha
 */
public class ExerciseFourteen {
    public static void main(String[] args) {
        String stringA = "Tom";
        String stringB = "Jack";
        String stringC = "Frank";

        compareStrings(stringA, stringB);
        compareStrings(stringA, stringC);
        compareStrings(stringB, stringC);
    }

    /**
     * 作用：比较两个字符串。
     * @param stringA 参与比较的第一个字符串。
     * @param stringB 参与比较的第二个字符串。
     */
    public static void compareStrings(String stringA, String stringB) {
        // 以下被注释掉的语句都是不能通过编译的。因为字符串不支持这些运算符。
//        System.out.println(stringA > stringB);
//        System.out.println(stringA >= stringB);
//        System.out.println(stringA < stringB);
//        System.out.println(stringA <= stringB);
//        System.out.println(stringA && stringB);
//        System.out.println(stringA || stringB);
//        System.out.println(stringA ! stringB);

        // 注意：==和!=比较的是对象的引用，equals()方法一般是用来比较对象的内容。
        System.out.println(stringA == stringB);
        System.out.println(stringA != stringB);
        System.out.println(stringA.equals(stringB));
        System.out.println();
    }
}
/*
输出：
    false
    true
    false

    false
    true
    false

    false
    true
    false


 */