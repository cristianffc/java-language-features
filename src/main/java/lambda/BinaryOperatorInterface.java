package lambda;

import java.util.function.BinaryOperator;

/**
    Target type: BinaryOperator<T>
    Function descriptor: (T, T) -> T
**/

public class BinaryOperatorInterface {
    public static void main(String[] args) {
        //Example 1
        BinaryOperator<Integer> multiplyValues = (source, target) -> {return source * target;};
        System.out.println(multiplyValues.apply(3,5));
    }
}
