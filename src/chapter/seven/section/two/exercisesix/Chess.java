/*
    问题：用Chess.java来证明前一段话（调用基类构造器必须是你在导出类构造器中要做的
    第一件事（如果你做错了，编译器会提醒你））。
 */
package chapter.seven.section.two.exercisesix;

public class Chess extends BoardGame {
    Chess() {
//        System.out.println("test");
        super(11); //// 必须是构造器中的第一条语句!
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}
/*
输出：
    Game constructor
    BoardGame constructor
    Chess constructor

 */