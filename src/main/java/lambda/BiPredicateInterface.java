package lambda;

import java.util.function.BiPredicate;

public class BiPredicateInterface {
    public static void main(String[] args) {
        //Script 1
        BiPredicate<Integer, String> checkValueText = (Integer value, String text) -> {
                    if(value.equals(3) && text.equals("hello"))
                        return true;
                    else
                        return false;};
        System.out.println(checkValueText.test(3,"hello"));
        System.out.println(checkValueText.test(3,"hi"));
    }
}
