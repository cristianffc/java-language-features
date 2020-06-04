package streams.finding;

import domain.entity.Food;
import domain.usecase.GenerateFood;

import java.util.List;
import java.util.Optional;

public class FindAnyElement {
    public static void main(String[] args) {
        List<Food> foods = GenerateFood.getFoodsList();

        Optional<Food> foodOpt = foods.stream()
                                      .filter(food -> food.getCalories() > 120)
                                      .findAny();

        System.out.println(foodOpt);
    }
}