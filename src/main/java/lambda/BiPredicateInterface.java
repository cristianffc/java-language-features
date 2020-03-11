package lambda;

import java.util.function.BinaryOperator;

public class BiPredicateInterface {
    public static void main(String[] args) {
        //Script 1
        BinaryOperator<Integer> multiplyValues = (Integer source, Integer target) -> {return source * target;};
        System.out.println(multiplyValues.apply(3,5));
    }
}
