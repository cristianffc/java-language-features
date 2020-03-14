package comparator;

import entity.Car;
import entity.Color;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static java.util.Comparator.comparing;

public class ComparatorPoc {

    public static void main(String []args) {
        Car car1 = new Car("Ferrari", Color.BLUE, 180);
        Car car2 = new Car("Mercedes", Color.RED, 200);
        Car car3 = new Car("BMW", Color.BLACK, 220);
        Car car4 = new Car("Audi", Color.RED, 200);

        List<Car> mockCars = Arrays.asList(car1, car2, car3);
        List<Car> cars = Arrays.asList(car1, car2, car3, car4);

        //Pass code creating comparator class
        mockCars.sort(new CarComparator());

        //Anonymous class
        mockCars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getMaxSpeed().compareTo(o2.getMaxSpeed());
            }
        });

        //Lambda expression
        //Script 1
        mockCars.sort((Car c1, Car c2) -> c1.getMaxSpeed().compareTo(c2.getMaxSpeed()));

        //Script2
        mockCars.sort((c1, c2) -> c1.getMaxSpeed().compareTo(c2.getMaxSpeed()));

        //Script 3
        Comparator<Car> carComparator = Comparator.comparing((Car car) -> car.getMaxSpeed());

        //Script 4
        mockCars.sort(comparing(car -> car.getMaxSpeed()));

        //Script 5
        //Sort cars by comparing car's max speed
        cars.sort(comparing(Car::getMaxSpeed));
        System.out.println("ASC max speed order" + cars);

        //Script 6
        cars.sort(comparing(Car::getMaxSpeed).reversed());
        System.out.println("DESC max speed order" + cars);

        //Script 7
        cars.sort(comparing(Car::getMaxSpeed).reversed().thenComparing(Car::getName));
        System.out.println("DESC max speed and name order" + cars);

    }
}
