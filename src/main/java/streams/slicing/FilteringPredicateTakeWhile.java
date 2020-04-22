package streams.slicing;

import entity.Car;
import entity.Color;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringPredicateTakeWhile {
    public static void main(String[] args) {
        Car car1 = new Car.Builder().withName("mockCar1").withColor(Color.BLUE).withSpeed(100).
                withaAutomaticGearbox(true).
                build();

        Car car2 = new Car.Builder().withName("mockCar2").withColor(Color.RED).withSpeed(120).
                withaAutomaticGearbox(false).
                build();

        Car car3 = new Car.Builder().withName("mockCar3").withColor(Color.BLACK).withSpeed(130).
                withaAutomaticGearbox(true).
                build();

        Car car4 = new Car.Builder().withName("mockCar4").withColor(Color.RED).withSpeed(150).
                withaAutomaticGearbox(false).
                build();

        Car car5 = new Car.Builder().withName("mockCar5").withColor(Color.RED).withSpeed(90).
                withaAutomaticGearbox(false).
                build();

        Car car6 = new Car.Builder().withName("mockCar6").withColor(Color.RED).withSpeed(160).
                withaAutomaticGearbox(false).
                build();

        List<Car> cars = Arrays.asList(car1,car2,car3,car4,car5,car6);
        List<Car> carsFiltered = cars.stream().
                takeWhile(car -> car.getMaxSpeed() < 125).
                collect(Collectors.toList());

        carsFiltered.forEach(System.out::print);
    }
}
