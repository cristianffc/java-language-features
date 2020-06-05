package java8.streams.optional;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.Optional;

public class FindAnyElement {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        Optional<Food> firstFood = foods.stream()
                                        .filter(food -> food.getCalories() == 300)
                                        .findAny();
        if (firstFood.isPresent()) {
            System.out.println(firstFood.get());
        }

        Optional<Food> secondFood = foods.stream()
                                         .filter(food -> food.getCalories() > 180)
                                         .findAny();
        System.out.println(secondFood.orElse(firstFood.get()));

        foods.stream()
             .filter(food -> food.getCalories() == 130)
             .findAny()
             .ifPresent(food -> System.out.println(food));
    }
}
