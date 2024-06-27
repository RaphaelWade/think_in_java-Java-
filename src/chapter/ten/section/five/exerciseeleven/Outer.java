package chapter.ten.section.five.exerciseeleven;

public class Outer {
    private class Inner implements Information {
        private Inner() {

        }

        @Override
        public void info() {
            System.out.println("This is something about UFO.");
        }
    }

    Information getInformation() {
        Inner inner = new Inner();

        return inner;
    }
}
