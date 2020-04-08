package lambda;

import java.util.function.BiFunction;

/**
    Target type: BiFunction<T, U, R>
    Function descriptor: (T, U) -> R
**/

public class BiFunctionInterface {
    public static void main(String[] args) {
        //Example 1
        BiFunction<Integer, Long, String> multiplyValues = (intValue, longValue)
                -> String.valueOf(intValue + longValue);
        System.out.println(multiplyValues.apply(3,5L));
    }
}
