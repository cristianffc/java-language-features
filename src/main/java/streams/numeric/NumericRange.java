package streams.numeric;

import entity.Car;
import entity.Color;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericRange {

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
                withName("mockCar3").
                withColor(Color.BLACK).
                withSpeed(130).
                withaAutomaticGearbox(true).
                build();

        Car car4 = new Car.Builder().
                withName("mockCar4").
                withColor(Color.RED).
                withSpeed(120).
                withaAutomaticGearbox(true).
                build();

        List<Car> cars = Arrays.asList(car1,car2,car3, car4);
        IntStream evenNumbers = IntStream.rangeClosed(1, 200).filter(n -> n % 2 == 0);

        System.out.println(evenNumbers.count());

    }
}
