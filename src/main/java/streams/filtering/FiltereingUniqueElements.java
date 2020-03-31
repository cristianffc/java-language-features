package streams.filtering;

import entity.Car;
import entity.Color;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltereingUniqueElements {

    public static void main(String[] args) {

        Car car1 = new Car.Builder().
                withName("mockCar1").
                withColor(Color.BLUE).
                withSpeed(100).
                withaAutomaticGearbox(true).
                build();

        Car car2 = new Car.Builder().
                withName("mockCar2").
                withColor(Color.RED).
                withSpeed(120).
                withaAutomaticGearbox(true).
                build();

        Car car3 = new Car.Builder().
                withName("mockCar2").
                withColor(Color.RED).
                withSpeed(120).
                withaAutomaticGearbox(true).
                build();

        Car car4 = new Car.Builder().
                withName("mockCar2").
                withColor(Color.RED).
                withSpeed(120).
                withaAutomaticGearbox(true).
                build();

        List<Car> cars = Arrays.asList(car1,car2,car3, car4);
        List<Car> carsWithAutomaticGearbox = cars.stream().
                filter(Car::getAutomaticGearbox).
                distinct().
                collect(Collectors.toList());

        carsWithAutomaticGearbox.forEach(System.out::print);

    }
}
