package lambda;

import java.util.function.BiConsumer;

/**
    Target type: BiConsumer<T, U>
    Function descriptor: (T, U) -> ()
**/

public class BiConsumerInterface {
    public static void main(String[] args) {
        //Example 1
        BiConsumer<Integer, String> printValueText = (value, target) -> {System.out.print(value + target);};
        printValueText.accept(3,"hello");
    }
}
