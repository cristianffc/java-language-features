package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateInterface {

    public static void main(String[] args) {

        Predicate<String> nonEmptyStringPredicate = (String word) -> !word.isEmpty();
        Predicate<Integer> evenNumberPredicate = (Integer number) -> {
            if (number % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };

        List<String> nonEmpty = filter(Arrays.asList("one", "two", "", "four", ""), nonEmptyStringPredicate);
        System.out.println("nonEmptyStringPredicate" + nonEmpty);

        List<Integer> evenNumber = filter(Arrays.asList(1, 2, 3, 4, 5), evenNumberPredicate);
        System.out.println(evenNumber);

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
