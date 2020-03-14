package comparator;

import entity.Car;
import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    public int compare(Car a1, Car a2) {
        return a1.getMaxSpeed().compareTo(a2.getMaxSpeed());
    }

}
