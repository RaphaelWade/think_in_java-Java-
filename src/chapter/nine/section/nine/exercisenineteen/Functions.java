/*
    问题：使用工厂方法来创建一个框架，它可以执行抛硬币和掷骰子功能。
 */
package chapter.nine.section.nine.exercisenineteen;

public class Functions {
    public static void implementFunctions(FunctionFactory FunctionFactory) {
        Function Function = FunctionFactory.getFunction();
        Function.implementFunction();
    }

    public static void main(String[] args) {
        implementFunctions(new CoinTossFunctionFactory());
        implementFunctions(new DiceRollingFunctionFactory());
    }
}

interface Function {
    void implementFunction();
}

interface FunctionFactory {
    Function getFunction();
}

class CoinTossFunction implements Function {

    @Override
    public void implementFunction() {
        System.out.println("Toss coins.");
    }
}

class CoinTossFunctionFactory implements FunctionFactory {

    @Override
    public Function getFunction() {
        return new CoinTossFunction();
    }
}

class DiceRollingFunction implements Function {

    @Override
    public void implementFunction() {
        System.out.println("Roll the dice.");
    }
}

class DiceRollingFunctionFactory implements FunctionFactory {

    @Override
    public Function getFunction() {
        return new DiceRollingFunction();
    }
}
/*
输出：
    Toss coins.
    Roll the dice.

 */