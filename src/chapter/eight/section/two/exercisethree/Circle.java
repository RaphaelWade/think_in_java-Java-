package chapter.eight.section.two.exercisethree;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void copy() {
        System.out.println("Copy the circle");
    }
}
