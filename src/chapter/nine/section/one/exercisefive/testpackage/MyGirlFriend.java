package chapter.nine.section.one.exercisefive.testpackage;

import chapter.nine.section.one.exercisefive.BestFriend;

public class MyGirlFriend implements BestFriend {

    @Override
    public void sing() {
        System.out.println("She is good at singing.");
    }

    @Override
    public void laugh() {
        System.out.println("She likes laughing.");
    }

    @Override
    public void listen() {
        System.out.println("She always listens to me patiently.");
    }
}
