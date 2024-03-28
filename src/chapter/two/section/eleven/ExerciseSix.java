/*
    问题：编写一个程序，让它包含本章所定义的storage()方法（p27）的代码段，并调用之。
 */
package chapter.two.section.eleven;

/**
 * @author Raphael Cha
 */
public class ExerciseSix {
    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        String str = "Programing is interesting";
        ExerciseSix exerciseSix = new ExerciseSix();

        System.out.println(exerciseSix.storage(str));
    }
}