package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
    Target type: Predicate<T>
    Function descriptor: T -> boolean
**/

public class PredicateInterface {
    public static void main(String[] args) {

        //Example 1
        Predicate<String> nonEmptyString = (String word) -> !word.isEmpty();
        Predicate<Integer> evenNumber = (Integer number) -> {
            if (number % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };

        //Example 2
        List<String> nonEmptyList = filter(Arrays.asList("one", "two", "", "four", ""), nonEmptyString);
        System.out.println("Print nonEmpty list: " + nonEmptyList);
                                                                                               
        //Example 3
        List<Integer> evenNumberList = filter(Arrays.asList(1, 2, 3, 4, 5), evenNumber);
        System.out.println("Even numbers: " + evenNumberList);

        //Example 4 - Using primitive specialization
        IntPredicate oddNumber = (int i) -> i % 2 != 0;
        System.out.println("101 odd number? " + oddNumber.test(101));
        System.out.println("100 odd number? " + oddNumber.test(100));
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }
}
