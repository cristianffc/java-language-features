package lambda;

import java.util.function.BiFunction;

/*
    Target type: BiFunction<T, U, R>
    Function descriptor: (T, U) -> R
*/

public class BiFunctionInterface {
    public static void main(String[] args) {
        //Script 1
        BiFunction<Integer, Long, String> multiplyValues = (Integer intValue, Long longValue)
                -> {return String.valueOf(intValue) + String.valueOf(longValue);};
        System.out.println(multiplyValues.apply(3,5L));
    }
}
