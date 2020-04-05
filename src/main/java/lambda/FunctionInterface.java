package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.LongFunction;

/**
    Target type: Function<T, R>
    Function descriptor: T -> R
**/

public class FunctionInterface {
    public static void main(String[] args) {
        //Example 1
        List<Integer> result = printSize(Arrays.asList("test","lambda","java"), (String text) -> text.length());
        System.out.println("Resulte size of \"test\", \"lambda\" and \"java\" strings: " + result);

        //Example 2
        LongFunction<String> numberToString = (long number) -> String.valueOf(number);
        System.out.println("Convert long to string: " + numberToString.apply(100L));
    }

    public static <T, R>  List<R> printSize (List<T> list, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        for(T t: list) {
            resultList.add(function.apply(t));
        }
        return resultList;
    }
}
