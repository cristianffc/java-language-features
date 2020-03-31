package streams.mapping;

import entity.Car;
import entity.Color;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping {

    public static void main(String[] args) {

        Car car1 = new Car.Builder().
                withName("mock Car First").
                withColor(Color.BLUE).
                withSpeed(100).
                withaAutomaticGearbox(true).
                build();

        Car car2 = new Car.Builder().
                withName("mock Car Second").
                withColor(Color.RED).
                withSpeed(120).
                withaAutomaticGearbox(false).
                build();

        Car car3 = new Car.Builder().
                withName("mock Car Third").
                withColor(Color.BLACK).
                withSpeed(130).
                withaAutomaticGearbox(true).
                build();

        Car car4 = new Car.Builder().
                withName("mock Car Fourth").
                withColor(Color.RED).
                withSpeed(120).
                withaAutomaticGearbox(true).
                build();

        List<Car> cars = Arrays.asList(car1,car2,car3, car4);
        List<Integer> carNames = cars.stream().
                map((Car car) -> car.getName().length()).
                collect(Collectors.toList());

        carNames.forEach(System.out::println);

        List<Integer> carNamesLength = cars.stream().
                map((Car car) -> car.getName()).
                map(String::length).
                collect(Collectors.toList());

        carNamesLength.forEach(System.out::println);

    }
}
