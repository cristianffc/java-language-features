package lambda;

import java.util.function.UnaryOperator;

/**
    Target type: UnaryOperator<T>
    Function descriptor: T -> T
**/

public class UnaryOperatorInterface {
    public static void main(String[] args) {
        //Example 1
        UnaryOperator<Integer> doubleTheValue = (input) -> {return 2 * input;};
        System.out.println(doubleTheValue.apply(3));
    }
}
