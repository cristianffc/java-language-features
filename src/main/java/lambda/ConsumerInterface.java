package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

public class ConsumerInterface {

    public static void main(String[] args) {
        Consumer<Integer> printConsole = (Integer number) -> System.out.println(number);
        printValues(Arrays.asList(1,2,3,4,5,6), printConsole);

        LongConsumer printLongValue = (long number) -> System.out.println(number);
        printLongValue.accept(100l);
    }

    public static <T> void printValues(List<T> list, Consumer<T> consumer) {
        List<T> results = new ArrayList();
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
