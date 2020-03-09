package lambda;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

    public static void main(String[] args) {
        //Script 1
        UnaryOperator<Integer> doubleTheValue = (Integer input) -> {return 2 * input;};
        System.out.println(doubleTheValue.apply(3));
    }
}
