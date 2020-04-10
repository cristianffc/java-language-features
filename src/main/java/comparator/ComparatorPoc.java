package comparator;

import entity.Car;
import entity.Color;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static java.util.Comparator.comparing;

public class ComparatorPoc {

    public static void main(String []args) {
        Car car1 = new Car("Ferrari", Color.BLUE, 180, true);
        Car car2 = new Car("Mercedes", Color.RED, 200, false);
        Car car3 = new Car("BMW", Color.BLACK, 220, true);
        Car car4 = new Car("Audi", Color.RED, 200, false);

        List<Car> mockCars = Arrays.asList(car1, car2, car3);
        List<Car> cars = Arrays.asList(car1, car2, car3, car4);

        //Different ways to create comparator
        //Pass code to create comparator class
        mockCars.sort(new CarComparator());

        //Anonymous class
        mockCars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getMaxSpeed().compareTo(o2.getMaxSpeed());
            }
        });

        //Lambda expressions
        //Example 1 - Lambda expression
        mockCars.sort((Car c1, Car c2) -> c1.getMaxSpeed().compareTo(c2.getMaxSpeed()));

        //Example 2 - Type inference
        mockCars.sort((c1, c2) -> c1.getMaxSpeed().compareTo(c2.getMaxSpeed()));

        //Example 3 - Static method helper
        Comparator<Car> carComparator = Comparator.comparing((Car car) -> car.getMaxSpeed());

        //Example 4 - Static method helper with type inference
        mockCars.sort(comparing(car -> car.getMaxSpeed()));

        //Example 5  - Method reference
        //Sort cars by car max speed
        cars.sort(comparing(Car::getMaxSpeed));
        System.out.println("ASC max speed order" + cars);

        //Example 6 -
        //Sort cars by max speed with inverse order
        cars.sort(comparing(Car::getMaxSpeed).reversed());
        System.out.println("DESC max speed order" + cars);

        //Example 7
        //Sort cars by max speed with inverse order and by car name
        cars.sort(comparing(Car::getMaxSpeed).reversed().thenComparing(Car::getName));
        System.out.println("DESC max speed and name order" + cars);
    }
}
