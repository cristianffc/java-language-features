package lambda;

import entity.Car;
import entity.Color;
import java.util.function.Predicate;

public class ComposePredicateInterface {

    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", Color.BLUE, 180, true);

        Predicate<Car> isAudiCar = car -> car.getName().equals("Audi");

        Predicate<Car> isNotAudiCar = isAudiCar.negate();

        Predicate<Car> isNotAudiCarAndIsBlue = isNotAudiCar.and(car -> car.getColor().equals(Color.BLUE));

        System.out.println("Is audi car? " + car1.getName() + " " + isAudiCar.test(car1));
        System.out.println("Is not audi car? " + car1.getName() + " " + isNotAudiCar.test(car1));
        System.out.println("Is not audi car and is blue? " + car1.getName() + " " + isNotAudiCarAndIsBlue.test(car1));
    }

}
