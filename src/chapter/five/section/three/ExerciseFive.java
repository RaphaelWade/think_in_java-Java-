/*
    问题：创建一个名为Dog的类，它具有重载的Bark()方法。此方法应根据不同的基本数据类型进行重载，并根据被调用的版本，打印出不同类型的狗吠（barking）、咆哮（howling）等信息。编写main()来调用所有不同版本的方法。 
 */
package chapter.five.section.three;

/**
 * @author Raphael Cha
 */
public class ExerciseFive {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.bark(110);
        dog.bark('c');
    }
}

class Dog {
    void bark(int number) {
        System.out.println("Barking!");
    }

    void bark(char ch) {
        System.out.println("Howling!");
    }
}
/*
输出：
    Barking!
    Howling!

 */