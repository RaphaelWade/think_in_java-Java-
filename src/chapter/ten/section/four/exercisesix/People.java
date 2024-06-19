package chapter.ten.section.four.exercisesix;

public class People {
    private String name;

    People(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " like playing with dog.");
    }

    protected class Dog implements Animal {

        @Override
        public void eat() {
            System.out.println("Dog eats meat.");
        }

        @Override
        public void drink() {
            System.out.println("Dog drinks water.");
        }
    }
}
