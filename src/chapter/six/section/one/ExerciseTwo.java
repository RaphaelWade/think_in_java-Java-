/*
    问题：将本节中的代码片段改写为完整的程序，并校验实际所发生的冲突。
 */
package chapter.six.section.one;

//import java.util.*;

public class ExerciseTwo {
    public static void main(String[] args) {
        Vector v = new Vector();
//        Vector<Integer> test = new Vector(); // IDEA默认这个Vector为chapter.six.section.one.Vector，而不是java.util.Vector，所以这条语句会报错。

        java.util.Vector<Integer> test = new java.util.Vector<>(); //写全称可以不用写“import java.util.*;”这条语句来导包。
        test.add(10);
        test.add(20);
        System.out.println(test);
    }
}

class Vector {
    public Vector() {
        System.out.println("chapter.six.section.one.Vector");
    }
}
/*
输出：
    chapter.six.section.one.Vector
    [10, 20]

 */