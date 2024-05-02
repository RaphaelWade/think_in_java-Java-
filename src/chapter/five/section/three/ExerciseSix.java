/*
    问题：修改前一个练习的程序，让两个重载方法各自接受两个类型的不同参数，但二者顺序相反。验证其是否工作。
 */
package chapter.five.section.three;

/**
 * @author Raphael Cha
 */
public class ExerciseSix {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();

        dog1.bark('c', 110);
        dog1.bark(110, 'c');
    }
}

class Dog1 {
    void bark(int number, char ch) {
        System.out.println("Barking!");
    }

    void bark(char ch, int number) {
        System.out.println("Howling!");
    }
}
/*
输出：
    Howling!
    Barking!

 */