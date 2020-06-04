package collectors.reducingsummarize;

import domain.entity.Car;
import domain.entity.Color;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningStrings {
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
        String names = cars.stream().map(Car::getName).collect(Collectors.joining());
        System.out.println(names);

        String namesSeparated = cars.stream().map(Car::getName).collect(Collectors.joining(" , "));
        System.out.println(namesSeparated);

    }

}
