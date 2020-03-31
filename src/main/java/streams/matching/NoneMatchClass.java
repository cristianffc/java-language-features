package streams.matching;

import entity.Car;
import entity.Color;
import java.util.Arrays;
import java.util.List;

public class NoneMatchClass {

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

        List<Car> cars = Arrays.asList(car1, car2, car3);

        if(cars.stream().noneMatch(car -> car.getMaxSpeed() > 140)) { //short-circuit operation
            System.out.println("All max speed cars below 140");
        }
    }
}
