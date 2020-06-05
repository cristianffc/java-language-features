package java8.lambda;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Target type: BinaryOperator<T>
 * Function descriptor: (T, T) -> T
 **/

public class BinaryOperatorInterface {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        BinaryOperator<Integer> totalCaloriesByUnit = (units, foodCalories) -> units * foodCalories;

        System.out.println(foods.get(1)
                                .getName() + " Calories: " + totalCaloriesByUnit.apply(10, foods.get(1)
                                                                                                .getCalories()));
        System.out.println(foods.get(1)
                                .getName() + " Calories: " + totalCaloriesByUnit.apply(20, foods.get(1)
                                                                                                .getCalories()));
        System.out.println(foods.get(1)
                                .getName() + " Calories: " + totalCaloriesByUnit.apply(15, foods.get(1)
                                                                                                .getCalories()));
        System.out.println(foods.get(1)
                                .getName() + " Calories: " + totalCaloriesByUnit.apply(5, foods.get(1)
                                                                                               .getCalories()));
        System.out.println(foods.get(1)
                                .getName() + " Calories: " + totalCaloriesByUnit.apply(10, foods.get(1)
                                                                                                .getCalories()));
    }
}