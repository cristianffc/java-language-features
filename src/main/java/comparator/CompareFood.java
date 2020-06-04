package comparator;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * Class to show different ways to compare food calories.
 */

public class CompareFood {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        //Pass code to create comparator class
        foods.sort(new FoodCaloriesComparator());
        System.out.println("Comparator class" + foods);

        //Anonymous class. It can be replaced by lambda
        foods.sort(new Comparator<Food>() {
            @Override
            public int compare(Food first, Food second) {
                return first.getCalories()
                            .compareTo(second.getCalories());
            }
        });
        System.out.println("Anonymous class" + foods);

        //Lambda expression
        foods.sort((Food first, Food second) -> first.getCalories()
                                                     .compareTo(second.getCalories()));
        System.out.println("Lambda expression" + foods);

        //Type inference
        foods.sort((first, second) -> first.getCalories()
                                           .compareTo(second.getCalories()));
        System.out.println("Type inference" + foods);

        //Static method helper
        Comparator<Food> FoodComparator = Comparator.comparing((Food food) -> food.getCalories());
        System.out.println("Static method player" + foods);

        //Static method helper with method inference
        foods.sort(comparing(food -> food.getCalories()));

        //Method reference
        foods.sort(comparing(Food::getCalories));
        System.out.println("Method reference" + foods);

        //Reverse order by calories
        foods.sort(comparing(Food::getCalories).reversed());
        System.out.println("Reverse reference" + foods);

        //Reverse order by calories and then by food name
        foods.sort(comparing(Food::getCalories).reversed()
                                               .thenComparing(Food::getName));
        System.out.println("DESC max speed and name order" + foods);
    }
}