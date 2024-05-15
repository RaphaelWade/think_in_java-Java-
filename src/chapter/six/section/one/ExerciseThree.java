/*
    问题：创建两个包：debug和debugoff，他们都包含一个相同的类，该类有一个debug()
    方法，第一个版本显示发送给控制台的String参数，而第二个版本什么也不做。使用静
    态import语句将该类导入到一个测试程序中，并示范条件编译效果。
 */
package chapter.six.section.one;

import static chapter.six.section.one.debug.ConditionalCompile.debug;

//import static chapter.six.section.one.debugoff.ConditionalCompile.debug;

public class ExerciseThree {
    public static void main(String[] args) {
        debug(args);
    }
}
