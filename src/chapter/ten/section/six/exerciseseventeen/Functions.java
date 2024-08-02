/*
    问题：修改第9章中练习19的解决方案，让它使用匿名内部类。
 */
package chapter.ten.section.six.exerciseseventeen;

public class Functions {
    public static void implementFunctions(FunctionFactory FunctionFactory) {
        Function function = FunctionFactory.getFunction();
        function.implementFunction();
    }

    public static void main(String[] args) {
        implementFunctions(CoinTossFunction.factory);
        implementFunctions(DiceRollingFunction.factory);
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

    public static FunctionFactory factory = new FunctionFactory() {
        @Override
        public Function getFunction() {
            return new CoinTossFunction();
        }
    };
}

class DiceRollingFunction implements Function {

    @Override
    public void implementFunction() {
        System.out.println("Roll the dice.");
    }

    public static FunctionFactory factory = new FunctionFactory() {
        @Override
        public Function getFunction() {
            return new DiceRollingFunction();
        }
    };
}
/*
输出：
    Toss coins.
    Roll the dice.

 */