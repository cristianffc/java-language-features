package streams.finding;

import entity.Car;
import entity.Color;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyClass {

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
        Optional<Car> targetCar = cars.stream().filter(car -> car.getMaxSpeed() == 120).findAny();
        System.out.println(targetCar);
    }
}
