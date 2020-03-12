package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/*
    Target type: Predicate<T>
    Function descriptor: T -> boolean
*/

public class PredicateInterface {

    public static void main(String[] args) {

        //Script 1
        Predicate<String> nonEmptyStringPredicate = (String word) -> !word.isEmpty();
        Predicate<Integer> evenNumberPredicate = (Integer number) -> {
            if (number % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };

        //Script 2
        List<String> nonEmpty = filter(Arrays.asList("one", "two", "", "four", ""), nonEmptyStringPredicate);
        System.out.println("nonEmptyStringPredicate" + nonEmpty);

        //Script 3
        List<Integer> evenNumber = filter(Arrays.asList(1, 2, 3, 4, 5), evenNumberPredicate);
        System.out.println(evenNumber);

        //Script 4
        IntPredicate oddNumber = (int i) -> i % 2 != 0;
        System.out.print(oddNumber.test(101));
        System.out.print(oddNumber.test(100));

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
