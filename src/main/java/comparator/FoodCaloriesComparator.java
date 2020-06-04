package comparator;

import domain.entity.Food;
import java.util.Comparator;

public class FoodCaloriesComparator implements Comparator<Food> {

    public int compare(Food first, Food second) {
        return first.getCalories().compareTo(second.getCalories());
    }
}