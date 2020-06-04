package lambda;

import domain.entity.Food;
import domain.entity.Type;
import domain.usecase.GenerateFood;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

/**
 * Target type: BiFunction<T, U, R>
 * Function descriptor: (T, U) -> R
 **/

public class BiFunctionInterface {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        BiFunction<Type, Food, Optional<Integer>> caloriesByType = (type, food) -> {
            if(type.equals(food.getType())) {
                return Optional.ofNullable(food.getCalories());
            }
            return Optional.empty();
        };

        System.out.println(foods.get(1).getName() + " Calories: " + caloriesByType.apply(Type.FRUIT, foods.get(1)));
        System.out.println(foods.get(2).getName() + " Calories: " + caloriesByType.apply(Type.FRUIT, foods.get(2)));
        System.out.println(foods.get(3).getName() + " Calories: " + caloriesByType.apply(Type.FRUIT, foods.get(3)));
        System.out.println(foods.get(4).getName() + " Calories: " + caloriesByType.apply(Type.FRUIT, foods.get(4)));
        System.out.println(foods.get(5).getName() + " Calories: " + caloriesByType.apply(Type.FRUIT, foods.get(5)));
        System.out.println(foods.get(6).getName() + " Calories: " + caloriesByType.apply(Type.FRUIT, foods.get(6)));
    }
}