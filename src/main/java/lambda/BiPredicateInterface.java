package lambda;

import java.util.function.BiPredicate;

/**
    Target type: BiPredicate<T, U>
    Function descriptor: (T, U) -> boolean
**/

public class BiPredicateInterface {
    public static void main(String[] args) {
        //Example 1
        BiPredicate<Integer, String> checkValueText = (value, text) -> {
                    if(value.equals(3) && text.equals("hello"))
                        return true;
                    else
                        return false;};
        System.out.println(checkValueText.test(3,"hello"));
        System.out.println(checkValueText.test(3,"hi"));
    }
}
