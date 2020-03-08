package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface {

    public static void main(String[] args) {

        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> nonEmpty = filter(Arrays.asList("one","two","","four",""), nonEmptyStringPredicate);
        System.out.println(nonEmpty);

    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for(T t: list) {
            if(p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }

}
