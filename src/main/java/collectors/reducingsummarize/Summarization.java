package collectors.reducingsummarize;

import entity.Car;
import entity.Color;

import java.util.*;
import java.util.stream.Collectors;

public class Summarization {
    public static void main(String[] args) {
        Car car1 = new Car.Builder().withName("mock Car First").withColor(Color.BLUE).withSpeed(100).
                withaAutomaticGearbox(true).
                build();

        Car car2 = new Car.Builder().withName("mock Car Second").withColor(Color.RED).withSpeed(120).
                withaAutomaticGearbox(false).
                build();

        Car car3 = new Car.Builder().withName("mock Car Third").withColor(Color.BLACK).withSpeed(130).
                withaAutomaticGearbox(true).
                build();

        List<Car> cars = Arrays.asList(car1, car2, car3);
        int sumSpeedCar = cars.stream().collect(Collectors.summingInt(Car::getMaxSpeed));
        System.out.println(sumSpeedCar);

        double avgSpeedCar = cars.stream().collect(Collectors.averagingInt(Car::getMaxSpeed));
        System.out.println(avgSpeedCar);

        IntSummaryStatistics menuStatistics = cars.stream().collect(Collectors.summarizingInt(Car::getMaxSpeed));
        System.out.println(menuStatistics);
    }
}
