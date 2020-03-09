package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

public class FunctionInterface {

    public static void main(String[] args) {
        //Script 1
        List<Integer> result = printSize(
                Arrays.asList("test","lambda","java"),
                (String text) -> text.length());
        System.out.print(result);

        //Script 2
        LongFunction<String> mapNumberToString = (long number) -> String.valueOf(number);
        System.out.print(mapNumberToString.apply(100L));
    }

    public static <T, R>  List<R> printSize (List<T> list, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        for(T t: list) {
            resultList.add(function.apply(t));
        }
        return resultList;
    }
}
