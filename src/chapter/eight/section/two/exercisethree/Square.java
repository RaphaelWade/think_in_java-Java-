package chapter.eight.section.two.exercisethree;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void copy() {
        System.out.println("Copy the square");
    }
}
