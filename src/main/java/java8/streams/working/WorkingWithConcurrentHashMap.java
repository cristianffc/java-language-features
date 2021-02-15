package java8.streams.working;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class WorkingWithConcurrentHashMap {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Long> map = new ConcurrentHashMap<>();
        map.put("First", 1L);
        map.put("Second", 2L);
        map.put("Third", 3L);
        map.put("Eleventh", 11L);

        long parallelismThreshold = 1;
        Optional<Long> maxValue =
                Optional.ofNullable(map.reduceValues(parallelismThreshold, Long::max));

        System.out.print(maxValue);

        System.out.print(map.mappingCount());
    }
}
