/*
    问题：编写具有两个（重载）构造器的类，并在第一个构造器中通过this调用第二个构造器。
 */
package chapter.five.section.four;

public class ExerciseNine {
    public static void main(String[] args) {
        TestClass test = new TestClass();
    }
}

class TestClass {
    TestClass() {
        this("This is my secret.");
    }
    TestClass(String information){
        System.out.println(information);
    }
}
/*
输出：
    This is my secret.

 */