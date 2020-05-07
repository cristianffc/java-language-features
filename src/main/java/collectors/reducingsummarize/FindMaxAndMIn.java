package collectors.reducingsummarize;

import entity.Car;
import entity.Color;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaxAndMIn {
    public static void main(String[] args) {
        Car car1 = new Car.Builder().withName("mock Car First").withColor(Color.BLUE).withSpeed(100).
                withaAutomaticGearbox(true).
                build();

        Car car2 = new Car.Builder().withName("mock Car Second").withColor(Color.RED).withSpeed(120).
                withaAutomaticGearbox(false).
                build();

        Car car3 = new Car.Builder().withName("mock Car Third"). withColor(Color.BLACK).withSpeed(130).
                withaAutomaticGearbox(true).
                build();

        List<Car> cars = Arrays.asList(car1, car2, car3);
        Comparator<Car> carComparator = Comparator.comparingInt(Car::getMaxSpeed);
        Optional<Car> maxSpeedCar = cars.stream().collect(Collectors.maxBy(carComparator));

        System.out.println(maxSpeedCar);
    }
}
