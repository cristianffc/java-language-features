package streams.builder;

import java.util.Arrays;

/**
 * Arrays.stream takes an array as parameter
 */

public class StreamFromArrays {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6};
        int sum = Arrays.stream(numbers).sum();

        System.out.println(sum);
    }
}