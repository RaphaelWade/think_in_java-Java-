/*
    问题：为前一个练习中的类添加一个重载构造器，令其接受一个字符串参数，并在构造器中把你自己的消息和接收的参数一起打印出来。
 */
package chapter.five.section.three;

/**
 * @author Raphael Cha
 */
public class ExerciseFour {
    ExerciseFour() {
        System.out.println("这是无参构造器！");
    }

    ExerciseFour(String string) {
        System.out.println("Hello " + string);
    }

    public static void main(String[] args) {
        ExerciseFour test = new ExerciseFour("world");
    }
}
/*
输出：
    Hello world
    
 */